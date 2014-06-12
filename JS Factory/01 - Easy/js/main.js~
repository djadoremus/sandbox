removeSpoiler = function(idx){
	var question = getQuestions()[idx];
	$("#question" + question.id).removeClass("qSpoilerOn");
}

viewData = function(idx){
	var question = getQuestions()[idx];
	var container = 
		"<div id='questionDialog" + question.id + "' class='qDialog'>" + 
			"<span>" + question.question + "</span>" +
		"</div>";
	$("#dialogContainer").empty();
	$("#dialogContainer").append(container);
	$("#dialogContainer").dialog({
		dialogClass:"no-close",
		height:600,
		width:800,
		buttons:[
			{text:"Answer",click:function(){
				var answer = 
					"<div id='answerDialog" + question.id + "' class='aContainer'>" + 
						"<span>Answer : " + question.answer+ "</span><br/><br/>" +
						"<span>Point(s) : " + question.point+ "</span>" +
					"</div>";
				$("#answerContainer").empty();
				$("#answerContainer").append(answer);
				$("#answerContainer").dialog({
					height:400,
					width:600,
				});
			}},
			{text:"Close",click:function(){
				removeSpoiler(idx);
				$("#question" + question.id).removeAttr("onclick");
				$("#dialogContainer").dialog("close");
			}}
		]
	});
}

containerFactory = function(question, idx){
	var container = "<div id='question" + question.id + "' class='qContainer qSpoilerOn' onclick='viewData(" + idx + ")'>" + 
		"<span class='title'>" + question.id + "</span><br/>" +
		"<span>Question : " + question.question + "</span><br/><br/>" +
		"<span>Answer : " + question.answer + "</span><br/>" +
		"<span>Point : " + question.point + "</span>" +
		"</div>";
	return container;
}

printData = function(){
	var questionsJSON = getQuestions();
	for (var i=0; i<questionsJSON.length; i++){
		var questionJSON = questionsJSON[i];
		$("#questionContainer").append(containerFactory(questionJSON, i)).append("<br/>");
	}
};