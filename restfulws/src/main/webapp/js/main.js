/**
 * 
 */

$(document).ready(function() {
	
	$('#fruitsDiv').hide();
	
	$('button').on('click', function() {
		
		$('h1#greeting').html("Changed Text");	
		
	});
	
	$('button#removeGreeting').on('click', function() {
		
		$('h1#greeting').remove();
		
	});
	
	$('button#changeCSS').on('click', function() {
		
		console.log($('h1#greeting2').css('background-color'));
		
		$('h1#greeting2').css({
			'color' : 'red',
			'background-color' : 'blue'
		});
	});
	
	$('button#changeAttributes').on('click', function() {
		
		$('h1#greeting').attr('align', 'center');
		
	});
	
	$('button#changeColorForFirst').on('click', function() {
		
		$('li:first').css('color', 'blue');
		
	});
	
	$('button#showFruits').on('click', function() {
		
		$('#fruitsDiv').slideDown(1000).delay(800).fadeIn(400);
		
	});
	
	$('button#addLast').on('click', function() {
		
		var grapes = $('<li>Grapes</li>');
		
		$('li:last').prev().prev().append(grapes);
		
	});
	
	$('#search').keyup(function(){
		var searchKey = $('#search').val();

		if(searchKey == '') {
			return;
		}
		
		var data = {searchKey: searchKey};
		
		$.getJSON('http://localhost:9090/restfulws/search.json', data, function(data) {
			
			var output = '<ul>';
			
			var results = data.stringList;
			$.each(results, function(index, value) {
				output += "<li><h2>" + value + "</h2></li>";
			});
			
			output += "</ul>";
			$('#update').html(output);
		});
	});
});


