<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
/*   .jumbotron {
      background-color: black;
      color: white;
      padding: 30px 25px;
  } */
  
  .navbar{
  }
  
  .container-fluid {
      padding: 60px 50px;
  }
  .bg-grey {
      background-color: #f6f6f6;
  }
  .logo-small {
      color: black;
      font-size: 50px;
  }
  .logo {
      color: black;
      font-size: 200px;
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
    }
  }
  
  #studyDiv{
     margin-top : 200px;
  }
  
  </style>
</head>
<body>
   
<nav class="navbar navbar-inverse navbar-fixed-top">

    <div class="container-fluid">
        <div class="navbar-header">
            <c:choose>
              <c:when test="${LoginID!=null}">
                     <a class="navbar-brand" href="#">박성준</a>
              </c:when>      
              <c:otherwise>
                     <a class="navbar-brand" href="#"></a>
              </c:otherwise>
            </c:choose>
        </div>
        
        
           <ul class="nav navbar-nav nav-pills" role="tablist">
            <li class="active"><a href="/index.jsp">Home</a></li>
            <li><a href="#Skill">Skill</a></li>
             <li><a href="#pic">PortFolio</a></li> 
             <li><a href="/Message.jsp">Message</a></li> 
            <li><a href="/study/Study.jsp">Study</a></li>
         </ul>
          <ul class="nav navbar-nav navbar-right">
           <li>
           <c:choose>
              <c:when test="${LoginID!=null}">
                 <a href="/log/LogOut.jsp"><span class="glyphicon glyphicon-off"></span>LogOut</a>   
              </c:when>
              <c:otherwise>
                       <a href="/log/Login.html"><span class="glyphicon glyphicon-log-in"></span>Login</a>
              </c:otherwise>
           </c:choose>      
           </li>
          </ul>
   </div>   
</nav>
   
   
<div class="container" id="studyDiv">

   <h1>Day02</h1>
        
     <div class="dropdown">
           <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">DAY2 리스트
           <span class="caret"></span></button>
        <ul class="dropdown-menu">
          <li><a href="#dataType">데이타 타입</a></li>
          <li><a href="#TypeConversion">형변환</a></li>
          <li><a href="#Tip">팁</a></li>
        </ul>
      </div>   
        

   <div class="panel panel-default">
        
        
        <div class="panel-heading">
           <h3>패키지란 무엇인가? 왜 사용하는거지??</h3>
        </div>
        
        <div class="panel-body">
           
           <h4>내가 구입한 A라는 회사와 B라는 회사가 만든 실행파일(.class)의 이름이 같다.</h4>
           <h4>실행을 하려고 해보니, 이름이 같아서 충돌이나버렸어.... 못쓰게 된거지.</h4>
           <h4>그러한 충돌 방지 ? 및 정리를 위해 패키지를 사용한다.</h4>
           <h4>보통 유일한, 도메인 이름으로 패키지를 정의한다.</h4>
           <h4>네임스페이스(도메인 - 유일한 값), 폴더 구조 = 패키지라고 할 수 있다.</h4>
        </div>
   
      <div class="panel-heading" id="dataType">
           <h3>자바에서 사용하는 데이터 타입</h3>
        </div>
        
        <div class="panel-body">
           
           <div id="jungsu">
              <hr/>
              <h3>정수</h3>
              <hr/>
              <table class="table">
                 <thead>
                    <tr>
                       <th>이름</th>
                       <th>범위</th>
                       <th>특징</th>
                    </tr>
                 </thead>
                 <tbody>
                    <tr class="success">
                       <td>byte</td>
                       <td>-128 ~ 127</td>
                       <td>네트워크. 즉 IO 부분에서 많이 사용된다</td>
                    </tr>
                    <tr class="info">
                       <td>char</td>
                       <td>한문자 - 2 byte</td>
                       <td>'가', unicode - 한글, 영문,한자 표현 가능. int 와 호환된다.</td>
                    </tr>
                    <tr class="info">
                       <td>short</td>
                       <td>byte와 int 사이</td>
                       <td>안쓴다.</td>
                    </tr>
                    <tr class="danger">
                       <td>★int</td>
                       <td>4Byte(-21억~21억)</td>
                       <td>정수의 기본타입(default)</td>
                    </tr>
                    <tr class="info">
                       <td>long</td>
                       <td>8Byte</td>
                       <td>int 보다 큰값</td>
                    </tr>
                 </tbody>
              
              </table>
           </div>
           <hr/>
                    
           <div id="silsu">
              <hr/>
              <h3>실수</h3>   
              <hr/>   
                 <table class="table">
                    <thead>
                       <tr>
                          <th>이름</th>
                          <th>범위</th>
                          <th>특징</th>
                       </tr>
                    </thead>
                    <tbody>
                       <tr class="info">
                          <td>float</td>
                          <td>4Byte</td>
                          <td>소수점 7자리 까지</td>
                       </tr>         
                       <tr class="danger">
                          <td>★double</td>
                          <td>8Byte</td>
                          <td>실수의 기본타입 (default)</td>
                       </tr>
                    </tbody>
                 </table>
              </div>
              <hr/>
              
              <div id="boolean">
                 <hr/>
                 <h3>Boolean</h3>   
                 <hr/>
                 <table class="table">
                    <thead>
                       <tr>
                          <th>이름</th>
                          <th>범위</th>
                          <th>특징</th>
                     </tr>
                    </thead>
                    <tbody>
                    <tr class="danger">
                       <td>★boolean</td>
                       <td>true , false</td>
                       <td>프로그램 흐름을 제어한다.</td>
                    </tr>
                    </tbody>
                 </table>      
              </div>
      </div>
         
      <hr/>      
      
      <div class="panel-heading" id="TypeConversion">
        
           <h3>형변환</h3>
   
      </div>
      
      <div class="panel-body">
         <h4>1.명시적 형변환 : </h4>
         <p>큰타입을 작은 타입에 대입할때</p>
         <p>데이터의 손실이 발생 할 수 있다.
         <h4>ex)</h4>
         <h4>double num1 = 10.5</h4>
         <h4>int num = (int)num1</h4>
         <br/>
         <h4>2.암묵적 형변환</h4>
         <p>작은타입을 큰타입에 대입할때</p>
         <h4>ex)</h4>
         <h4>int num = 5</h4>
         <h4>double num1 = num | double num1 = (double)num</h4>
         <h2>핵심 : 데이터의 값을 보는게 아닌 Type 을 확인하자</h2>
      </div>      
   
   
   
      <div class="panel-heading" id="tip">
              <h3>Tip - 자바에서 특수문자 사용시</h3>
      </div>   

      <div class="panel-body">
      
         <h4>Ex : c:\Temp</h4>
         <h4>String str = "홍\"길\"동";  앞에 \ 써주면 된다.</h4>
         <br/>
         
         <h4>결과값 : 홍"길"동</h4>
         
      </div>


   </div>
   

</div>   
   
   
   

</body>
</html>