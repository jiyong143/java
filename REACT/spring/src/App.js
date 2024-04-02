import {useState} from 'react';


function App() {
  useEffect(() => {
    fetch('/api/post/list')
        .then((res) => res.json())
        .then(res=>res.list)
        .then(res=>res.forEach(item=>{
          console.log(item);
        })
          )
          
      
}, []);
  return (
    <div className="App">
      
    </div>
  );
}

export default App;
