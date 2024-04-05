import './App.css';
import { useState } from 'react';
import {BrowserRouter, Route, Link, Routes, useLocation, useNavigate, Navigate} from 'react-router-dom'

function App() {
   /*영화를 조회, 삭제하고 둥록하는 사이트를 구현
    영화 조회는 / 에서
    영화 등록은 /add에서
    영화 등록시 영화번호 (숫자), 제목,  장르, 개봉일을 입력하여 등록
    새 영화 등록 후에는 모든 입력 필드가 깨끗하게 비워준다
    영화 번호는 중복되지 않게 입력해서 추가
    영화 조회에서 영화 삭제버튼을 클릭하면 삭제되도록 구현 : 리스트에서 번지를 이용해서 삭제한다 */

  let [list, setList] = useState([]);

  function add(movie){
    setList([movie, ...list]);
  }
  function remove(index){
    let tmpList = [...list];
    tmpList.splice(index, 1);
    setList(tmpList);
  }

  return (
    <BrowserRouter>
      <Nav/>
      <Routes>
        <Route path="/" exact element={<List list={list} add={add} remove={remove}/>} />
        <Route path="/add" element={<Add/>} />
      </Routes>
    </BrowserRouter>
  );
}
function Nav(){
  return (
    <ul className="menu-list">
      <li><Link to="/">List</Link></li>
      <li><Link to="/add">Add New Movie</Link></li>
    </ul>
  );
}
function List({list, add, remove}){

  const location = useLocation();
  let movie = location.state;
  if(movie != null){
    add(movie);
    location.state = null;
  }
  return (
    <div>
      <h1>Movies</h1>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Genre</th>
            <th>Release Date</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {
            list.map((item, index)=>{
              return (
                <tr>
                  <td>{item.id}</td>
                  <td>{item.title}</td>
                  <td>{item.genre}</td>
                  <td>{item.releaseDate}</td>
                  <td><button onClick={()=>remove(index)}>Delete</button></td>
                </tr>
              )
            })
          }
          
        </tbody>
      </table>
    </div>
  );
}
function Add(){
  let [id, setId] = useState("");
  let [title, setTitle] = useState("");
  let [genre, setGenre] = useState("");
  let [releaseDate, setReleaseDate] = useState("");

  const idChange = (e) => setId(e.target.value);
  const titleChange = (e) => setTitle(e.target.value);
  const genreChange = (e) => setGenre(e.target.value);
  const releaseDateChange = (e) => setReleaseDate(e.target.value);


  const navigate = useNavigate();

  function addMovie(){
    navigate("/",{
      state : {
        id,
        title,
        genre,
        releaseDate,
      }
    })
    setId(""); 
    setTitle("");
    setGenre("");
    setReleaseDate("");
  }

  return (
    <div>
      <h1>Create Movie</h1>
      <div>
        <input type="number" placeholder="Input movie id" onChange={idChange} value={id}/>
      </div>
      <div>
        <input type="text" placeholder="Input movie title" onChange={titleChange} value={title}/>
      </div>
      <div>
        <input type="text" placeholder="Input movie genre" onChange={genreChange} value={genre}/>
      </div>
      <div>
        <label for="releaseDate">출시일 : </label>
        <input type="date" id="releaseDate" placeholder="연도-월-일" onChange={releaseDateChange} value={releaseDate}/>
      </div>
      <button onClick={addMovie}>Add Movie</button>
    </div>
  )
}
export default App;