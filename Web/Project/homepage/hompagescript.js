function createStamp() {
  var obj = document.getElementById("bottom");
  var newStamp = document.createElement("stamp");
  newStamp.innerHTML = "<img id='clab' src='img/clab.png' alt='과학상상화'>";
  newStamp.setAttribute("id", "news");
  newStamp.onclick = function () {
    var p = this.parentElement;
    p.removeChild(this);
  }
  obj.appendChild(newStamp);
  var clab = document.getElementById("clab");
  clab.onload = function(){
    var mySpan = document.getElementById("mySpan");
    mySpan.innerHTML = clab.width + "x" + clab.height;
  }
}
function photo(){
  document.getElementById("board_photo").style.display ="inline-block";
  document.getElementById("board_update").style.display ="none";
  document.getElementById("board_lunch").style.display ="none";
}
function lunch(){
  document.getElementById("board_photo").style.display ="none";
  document.getElementById("board_update").style.display ="none";
  document.getElementById("board_lunch").style.display ="inline-block";
}
function update(){
  document.getElementById("board_photo").style.display ="none";
  document.getElementById("board_update").style.display ="inline-block";
  document.getElementById("board_lunch").style.display ="none";
}
