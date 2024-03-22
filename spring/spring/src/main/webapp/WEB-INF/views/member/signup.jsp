<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>  
    <!-- jquery validation -->
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.5/dist/additional-methods.min.js"></script>
	<title>스프링 - 회원가입</title>
</head>
<body>
<form action="<c:url value="/signup"/>" method="post">
	<h1>회원가입</h1>
	<div class="form-group">
		<label for="id">아이디</label>
		<input type="text" class="form-control" id="id" name="me_id">
		<label id="id-error" class="error text-danger" for="id"></label>
	</div>
	<div class="form-group">
		<label for="pw">비번</label>
		<input type="password" class="form-control" id="pw" name="me_pw">
		<label id="pw-error" class="error text-danger" for="pw"></label>
	</div>
	<div class="form-group">
		<label for="pw2">비번확인</label>
		<input type="password" class="form-control" id="pw2" name="me_pw2">
		<label id="pw2-error" class="error text-danger" for="pw2"></label>
	</div>
	<div class="form-group">
		<label for="name">닉네임</label>
		<input type="text" class="form-control" id="name" name="me_name">
		<label id="name-error" class="error text-danger" for="name"></label>
	</div>
	<div class="form-group">
		<label for="email">이메일</label>
		<input type="text" class="form-control" id="email" name="me_email">
		<label id="email-error" class="error text-danger" for="email"></label>
	</div>
	<div class="form-group">
		<label for="phone">전화번호</label>
		<input type="text" class="form-control" id="phone" name="me_phone">
		<label id="phone-error" class="error text-danger" for="phone"></label>
	</div>
	<div class="form-group">
		<label for="address">주소</label>
		<input type="text" class="form-control" id="address" name="me_address">
		<label id="address-error" class="error text-danger" for="address"></label>
	</div>
	<div class="form-group">
		<label for="birth">생년월일</label>
		<input type="text" class="form-control" id="birth" name="me_birth">
		<label id="birth-error" class="error text-danger" for="birth"></label>
	</div>
	<button class="btn btn-outline-success col-12">회원가입</button>
</form>
<!-- 유효성 검사 -->
<script type="text/javascript">
$("form").validate({
	rules : {
		me_id : {
			required : true,
			regex : /^[a-zA-Z0-9]{6,8}$/
		},
		me_pw : {
			required : true,
			regex : /^[a-zA-Z0-9!@#$]{8,14}$/
		},
		
		me_pw2 : {
			equalTo : pw // name 이 아닌 id를 써줌 
		}
		me_email : {
			required : true,
			regex : /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/
		},
		me_phone : {
			required : true,
			regex : /^[0-9]{11}$/
		},
		me_address : {
			required : true,
			regex : /([가-힣])+(시) +([가-힣])+(구) +([가-힣])+(동)/
		},
		me_birth : {
			required : true,
			regex : /^[0-9]{6}$/
		},
		me_name : {
			required : true,
			regex : /^[ㄱ-힣]{1,5}$/
		}
	},
	messages : {
		me_id : {
			required : "필수 항목입니다.",
			regex : "아이디는 영문 대·소문자, 숫자 6~8자만 사용가능합니다."
		},
		me_pw : {
			required : "필수 항목입니다.",
			regex : "비밀번호는 영문 대·소문자, 숫자, 특수기호(!@#$) 8~14자만 사용가능합니다."
		},
		
		me_pw2 : {
			equalTo : "비밀번호와 일치하지 않습니다."
		}
		me_email : {
			required : "필수 항목입니다.",
			regex : "이메일은 최대 30자 까지 가능합니다."
		},
		me_phone : {
			required :"필수 항목입니다.",
			regex : "전화번호는 -를 제외한 11자리를 입력하세요."
		},
		me_address : {
			required : "필수 항목입니다.",
			regex : "주소를 올바르게 입력하세요. 예시) 양식 : OO시 OO구 OO동"
		},
		me_birth : {
			required : "필수 항목입니다.",
			regex : "생년월일은 주민번호 앞 6자리를 입력하세요."
		},
		me_name : {
			required :"필수 항목입니다.",
			regex : "이름은 한글로 최대 5자 까지 가능합니다."
		}
	}
});

$.validator.addMethod( 
		"regex",
		function(value,element,regexp){
			var re = new RegExp(regexp);
			return this.optional(element)||re.test(value);
		},
		"정규 표현식에 맞지 않습니다."
)


</script>
</body>
</html>