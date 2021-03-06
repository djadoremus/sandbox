getQuestions = function(){
	var questionsText = '['+
		'{"id":1,"question":"The meaning of the name “Jesus” which expresses his identity and his mission “because he will save his people from their sins” (Matt 1:21)<br/><br/>'+
			'a. God Saves<br/>'+
			'b. God Almighty<br/>'+
			'c. God helps<br/>'+
			'd. God the Father<br/>'+
		'","answer":"a. God Saves","point":0},'+
		'{"id":2,"question":"She was preserved from original sin from the first instance of her conception.","answer":"Mary","point":0},' + 
		'{"id":3,"question":"He is true God and true man with two natures, a divine nature and human nature<br/><br/>'+
			'a. God the Father<br/>'+
			'b. Jesus Christ<br/>'+
			'c. Mother Mary<br/>'+
		'","answer":"b. Jesus Christ","point":0},'+
		'{"id":4,"question":"Jesus Christ was born during the time of King Herod and Emperor ______. Who is this man?<br/><br/>'+
			'a. Pontius Pilate<br/>'+
			'b. Cerinus of Syria<br/>'+
			'c. Caesar Augustus<br/>'+
			'd. Nero<br/>'+
		'","answer":"c. Caesar Augustus","point":0},'+
		'{"id":5,"question":"Jesus is the ____ of the world and of history.<br/><br/>'+
			'a. Savior<br/>'+
			'b. Lord<br/>'+
			'c. Divinity<br/>'+
		'","answer":"b. Lord","point":0},'+
		'{"id":6,"question":"“For us men and for our _____, the Son of God became incarnate in the womb of the Virgin Mary by the power of the Holy Spirit”","answer":"Salvation","point":0},' + 
		'{"id":7,"question":"“Jesus Christ is true God and true man with _____ natures united in one Person.","answer":"Two","point":0},' + 
		'{"id":8,"question":"Did the Son of God have a soul with human knowledge? He assumed a body animated by a rational _____ soul.","answer":"Human","point":0},' + 
		'{"id":9,"question":"______ is the union of the divine and human nature of in the one divine Person of the Word","answer":"Incarnation","point":0},' + 
		'{"id":10,"question":"Jesus Christ is true God and true man with _____ natures united in one Person.","answer":"Two","point":0},' + 
		'{"id":11,"question":"Did the Son of God have a soul with human knowledge? He assumed a body animated by a rational _____ soul.","answer":"Human","point":0},' + 
		'{"id":12,"question":"By the grace of God, Mary was kept free from _____ sin from the first instance of her conception. <br/><br/>'+
			'a. Original<br/>'+
			'b. Personal<br/>'+
			'c. Impersonal<br/>'+
		'","answer":"b. Personal","point":0},'+
		'{"id":13,"question":"The symbols of faith or professions of faith is also known as <br/><br/>'+
			'a. Creed<br/>'+
			'b. The Our Father<br/>'+
			'c. The Hail Mary<br/>'+
			'd. The Liturgy of the hour<br/>'+
			'e. None of the above<br/>'+
		'","answer":"a. Creed","point":0},'+
		'{"id":14,"question":"This refers to the state of deprivation of original holiness and justice.<br/><br/>'+
			'a. Personal Sin<br/>'+
			'b. Original Sin<br/>'+
			'c. Mortal Sin<br/>'+
			'd. Venial SIn<br/>'+
		'","answer":"b. Original Sin","point":0},'+
		'{"id":15,"question":"True or False: The authors of Scripture were only instruments under the influence of the Holy Spirit, who dictated to them the words to be written down. ","answer":"False","point":0},' + 
		'{"id":16,"question":"True or False. As long as we have the Catechism, we need not read the Bible. ","answer":"False","point":0},' + 
		'{"id":17,"question":"True or False. The crossing of the Red Sea prefigures Christian Baptism. ","answer":"True","point":0},' + 
		'{"id":18,"question":"True or false. The angels specifically surround and serve Christ. ","answer":"True","point":0},' + 
		'{"id":19,"question":"True or false. Because God has willed the diversity of his creatures and their own particular goodness, their interdependence, and their order, it is therefore true that all created things are of equal value. ","answer":"False","point":0},' + 
		'{"id":20,"question":"Which is true? <br/><br/>'+
			'a. A person is spirit, but encased in a material vessel. <br/>'+
			'b. A person is wholly material. <br/>'+
			'c. A person is a spirit destined to final release from its body in heaven. <br/>'+
			'd. A person is a union of body and soul.<br/>'+
			'e. a and b<br/>'+
		'","answer":"d. a person is a union of body and soul","point":0},'+
		'{"id":21,"question":"The fact of man being made male and female<br/><br/>'+
			'a. means that the man or the woman is fundamentally incomplete without the other. <br/>'+
			'b. means that they were created to be a communion of persons. <br/>'+
			'c. is of minimal significance. <br/>'+
			'd. means that they are complementary as masculine and feminine. <br/>'+
			'e. b and d.<br/>'+
		'","answer":"e. b and d","point":0},'+
		'{"id":22,"question":"True or false: Faith is completely our own work which we offer to God who, in return, gives us eternal life. ","answer":"False","point":0},' + 
		'{"id":23,"question":"True or False: The truths of faith and the truths of science can, and sometimes do, contradict each others. ","answer":"False","point":0},' + 
		'{"id":24,"question":"True or False: Without faith, even leading a good and upright life will not suffice for us to obtain eternal life. ","answer":"True","point":0},' + 
		'{"id":25,"question":"Which is more certain -- faith, or human knowledge? Why?","answer":"Faith","point":0},' + 
		'{"id":26,"question":"True or false. Prayers of intercession are also to be extended to one&lsquos enemies. ","answer":"True","point":0},' + 
		'{"id":27,"question":"True or False. Because of her sin, Eve is not considered a proper anticipation of the role of Mary. ","answer":"False","point":0},' + 
		'{"id":28,"question":"True or false.After the virgin birth of Jesus, Mary, as it says in Scripture, had other children.","answer":"False","point":0},' + 
		'{"id":29,"question":"True or false. Mary is the symbol of the Church. ","answer":"True","point":0},' + 
		'{"id":30,"question":"True or False: God is Truth because he can neither deceive or be deceived.","answer":"True","point":0}' + 
	']';
	return JSON.parse(questionsText);
}
