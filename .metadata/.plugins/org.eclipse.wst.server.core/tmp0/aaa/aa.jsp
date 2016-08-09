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
                     <a class="navbar-brand" href="#">�ڼ���</a>
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
           <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">DAY2 ����Ʈ
           <span class="caret"></span></button>
        <ul class="dropdown-menu">
          <li><a href="#dataType">����Ÿ Ÿ��</a></li>
          <li><a href="#TypeConversion">����ȯ</a></li>
          <li><a href="#Tip">��</a></li>
        </ul>
      </div>   
        

   <div class="panel panel-default">
        
        
        <div class="panel-heading">
           <h3>��Ű���� �����ΰ�? �� ����ϴ°���??</h3>
        </div>
        
        <div class="panel-body">
           
           <h4>���� ������ A��� ȸ��� B��� ȸ�簡 ���� ��������(.class)�� �̸��� ����.</h4>
           <h4>������ �Ϸ��� �غ���, �̸��� ���Ƽ� �浹�̳����Ⱦ�.... ������ �Ȱ���.</h4>
           <h4>�׷��� �浹 ���� ? �� ������ ���� ��Ű���� ����Ѵ�.</h4>
           <h4>���� ������, ������ �̸����� ��Ű���� �����Ѵ�.</h4>
           <h4>���ӽ����̽�(������ - ������ ��), ���� ���� = ��Ű����� �� �� �ִ�.</h4>
        </div>
   
      <div class="panel-heading" id="dataType">
           <h3>�ڹٿ��� ����ϴ� ������ Ÿ��</h3>
        </div>
        
        <div class="panel-body">
           
           <div id="jungsu">
              <hr/>
              <h3>����</h3>
              <hr/>
              <table class="table">
                 <thead>
                    <tr>
                       <th>�̸�</th>
                       <th>����</th>
                       <th>Ư¡</th>
                    </tr>
                 </thead>
                 <tbody>
                    <tr class="success">
                       <td>byte</td>
                       <td>-128 ~ 127</td>
                       <td>��Ʈ��ũ. �� IO �κп��� ���� ���ȴ�</td>
                    </tr>
                    <tr class="info">
                       <td>char</td>
                       <td>�ѹ��� - 2 byte</td>
                       <td>'��', unicode - �ѱ�, ����,���� ǥ�� ����. int �� ȣȯ�ȴ�.</td>
                    </tr>
                    <tr class="info">
                       <td>short</td>
                       <td>byte�� int ����</td>
                       <td>�Ⱦ���.</td>
                    </tr>
                    <tr class="danger">
                       <td>��int</td>
                       <td>4Byte(-21��~21��)</td>
                       <td>������ �⺻Ÿ��(default)</td>
                    </tr>
                    <tr class="info">
                       <td>long</td>
                       <td>8Byte</td>
                       <td>int ���� ū��</td>
                    </tr>
                 </tbody>
              
              </table>
           </div>
           <hr/>
                    
           <div id="silsu">
              <hr/>
              <h3>�Ǽ�</h3>   
              <hr/>   
                 <table class="table">
                    <thead>
                       <tr>
                          <th>�̸�</th>
                          <th>����</th>
                          <th>Ư¡</th>
                       </tr>
                    </thead>
                    <tbody>
                       <tr class="info">
                          <td>float</td>
                          <td>4Byte</td>
                          <td>�Ҽ��� 7�ڸ� ����</td>
                       </tr>         
                       <tr class="danger">
                          <td>��double</td>
                          <td>8Byte</td>
                          <td>�Ǽ��� �⺻Ÿ�� (default)</td>
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
                          <th>�̸�</th>
                          <th>����</th>
                          <th>Ư¡</th>
                     </tr>
                    </thead>
                    <tbody>
                    <tr class="danger">
                       <td>��boolean</td>
                       <td>true , false</td>
                       <td>���α׷� �帧�� �����Ѵ�.</td>
                    </tr>
                    </tbody>
                 </table>      
              </div>
      </div>
         
      <hr/>      
      
      <div class="panel-heading" id="TypeConversion">
        
           <h3>����ȯ</h3>
   
      </div>
      
      <div class="panel-body">
         <h4>1.����� ����ȯ : </h4>
         <p>ūŸ���� ���� Ÿ�Կ� �����Ҷ�</p>
         <p>�������� �ս��� �߻� �� �� �ִ�.
         <h4>ex)</h4>
         <h4>double num1 = 10.5</h4>
         <h4>int num = (int)num1</h4>
         <br/>
         <h4>2.�Ϲ��� ����ȯ</h4>
         <p>����Ÿ���� ūŸ�Կ� �����Ҷ�</p>
         <h4>ex)</h4>
         <h4>int num = 5</h4>
         <h4>double num1 = num | double num1 = (double)num</h4>
         <h2>�ٽ� : �������� ���� ���°� �ƴ� Type �� Ȯ������</h2>
      </div>      
   
   
   
      <div class="panel-heading" id="tip">
              <h3>Tip - �ڹٿ��� Ư������ ����</h3>
      </div>   

      <div class="panel-body">
      
         <h4>Ex : c:\Temp</h4>
         <h4>String str = "ȫ\"��\"��";  �տ� \ ���ָ� �ȴ�.</h4>
         <br/>
         
         <h4>����� : ȫ"��"��</h4>
         
      </div>


   </div>
   

</div>   
   
   
   

</body>
</html>