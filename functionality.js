window.onload = () => {
	var addLink = "<div id='reserve'><a href=''>Book a tour now!</a></div><div id='reserve'><a href=''>Check Friends who Visited!</a></div>";
	var setImage = document.getElementById('img-container');
	var b1 = document.getElementById('b1');
	var b2 = document.getElementById('b2');
	var b3 = document.getElementById('b3');
	var b4 = document.getElementById('b4');
	var b5 = document.getElementById('b5');
	b1.onclick = () => {
		setImage.innerHTML = "<img src='img/1.jpg'/>" + addLink 
	}
	b2.onclick = () => {
		setImage.innerHTML = "<img src='img/2.jpg'/>" + addLink 
	}
	b3.onclick = () => {
		setImage.innerHTML = "<img src='img/3.jpg'/>" + addLink 
	}
	b4.onclick = () => {
		setImage.innerHTML = "<img src='img/4.jpg'/>" + addLink 
	}
	b5.onclick = () => {
		setImage.innerHTML = "<img src='img/5.jpg'/>" + addLink 
	}
	document.getElementById('menulink').onclick = function () {
		var menu = document.getElementById('menu');
		if (menu.className != 'showmenu') {
			menu.className = 'showmenu';
		}
		else {
			menu.className = 'hiddenmenu';
		}
	}
}
