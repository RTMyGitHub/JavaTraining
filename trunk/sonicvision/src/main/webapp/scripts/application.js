jQuery(document).ready(function ($) {

	//Make the current Menu link active
	var currentPage = $("body").data("currentpage");
	var currentMenuLi = $(".nav-pills li#" + currentPage);
	$(currentMenuLi).addClass("active");
	
	var options = { $AutoPlay: true };
    var jssor_slider1 = new $JssorSlider$('slider1_container', options);
});

function initialize() {
    var mapCanvas = document.getElementById('map-canvas');
    var mapOptions = {
      center: new google.maps.LatLng(42.577805, -83.146400),
      zoom: 15,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    }
    var map = new google.maps.Map(mapCanvas, mapOptions)
};

google.maps.event.addDomListener(window, 'load', initialize);
