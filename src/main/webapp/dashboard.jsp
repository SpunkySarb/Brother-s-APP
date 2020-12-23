<!Doctype html>

<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="refresh" content="10" url="/dashboard">
</head>
<style>

#bottom {
padding-top: 10px;
text-align: center;
width: 100%;
background-color: green;
height: 70px;
position: -webkit-sticky; /* Safari */
  position: sticky;
  bottom: 0;

}

#top {
text-align: center;
position: -webkit-sticky; /* Safari */
  position: sticky;
  top: 0;
width: 100%;
background-color: green;
height: 100px;

}

#middle {
padding-top: 10px;
text-align: center;

width: 100%;
background-color: green;
height: 100%;

}

#posts {

text-align: center;
margin: auto;
width: 80%;
background-color: #7cf27c;
padding:10px;

}
#name {

text-align: center;
}


#userName {
color:#075207;
font-style: bold;
font-family: 'Courier New', monospace;
font-size: 30px;

}

#text {
color:black;
font-style: bold;
font-family: cursive;
font-size: 30px;

}
</style>

<script>

function lastMessage(){

window.scrollTo(0,document.body.scrollHeight);
document.getElementById('name').value= localStorage.getItem("name");

}

window.onload = function() {
    var reloading = sessionStorage.getItem("reloading");
    if (reloading) {
        sessionStorage.removeItem("reloading");
      lastMessage();
    }
}


</script>

<body onload="lastMessage()">
<div id="top">
 <img src="logo.png" alt="Girl in a jacket" width="300" height="120"> 
<br>

</form> 



</div>

<div id="middle">


${messages}

</div>



<div id="bottom">


<form action="send" id="form" >
  <input type="hidden" id="name" name="name" value="" >
  <input type="text" id="message" name="message" value="" placeholder="Start Typing...">
  <input id="submitButton" type="submit" value="SEND" >
</form> 



</div>
</body>
</html>
