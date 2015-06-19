$(document).ready(function() {
	
	$("#productSearch").keyup(function() {
		
		var searchKey = $("#productSearch").val();
		
		//If user didn't enter anything, do not go to server. Just empty the html in the search results div.
		if(searchKey == '') {
			$("#searchResults").html("");
			return;
		}
		
		var data = {"key" : searchKey};
		
		$.getJSON('http://localhost:9090/ajax/search.json', data, function(responseData) {
			
			var searchResultsHtml = "";
			
			var resultsArray = responseData.stringList;
			
			$.each(resultsArray, function(index, value) {
				
				var idOfAnchorTag = "searchResult_"+index;
				
				searchResultsHtml += "<a href='#' id='" + idOfAnchorTag + "' onclick=\"copyIntoSearchBox('" + idOfAnchorTag + "')\">" + value + "</a><br/>";
				
			});
			
			//Write the final HTML into search results div
			$("#searchResults").html(searchResultsHtml);
			
		});
		
	});
});

function copyIntoSearchBox(id) {
	
	console.log(id);
	
	var jQueryId = "#"+id;
	console.log(jQueryId);
	
	var selectedAnchorTagValue = $(jQueryId).text();
	console.log('selectedAnchorTagValue = ' + selectedAnchorTagValue);
	
	$("#productSearch").val(selectedAnchorTagValue);
}