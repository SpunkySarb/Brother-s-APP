<!Doctype html>

<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<style>

#login {
padding-top: 100px;
text-align: center;
width: 100%;
background-color: green;
height: 700px;

}

#name {

text-align: center;
}


</style>

<script>

function store(){

name = document.getElementById('name').value;

localStorage.setItem("name", name);
  

}

</script>

<body>
<div id="login">
 <img src="logo.png" alt="Girl in a jacket" width="300" height="120"> 
<br>
<form action="dashboard" id="form"  onsubmit="store()">

  <input type="text" id="name" name="name" value="" placeholder="Enter your name"><br><br>
  <input type="submit" value="LOGIN" >
</form> 

<br><br><br><br><br><br><br>
<p>Developed by<br>
<Strong>SAGAR</Strong></p>

</div>
</body>
</html>
