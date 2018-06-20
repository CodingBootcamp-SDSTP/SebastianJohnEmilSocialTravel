window.onload = () => {
    var setImage = document.getElementById('map-container');
    var content ="<h1>Where to go?</h1>";
    for(var counter = 1; counter<11; counter++) {
        content = content + "<a href='/'><img src='img/"+counter+".jpg'/></a>"
    }
    setImage.innerHTML = content;
}
