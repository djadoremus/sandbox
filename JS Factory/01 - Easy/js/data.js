getQuestions = function(){
	var questionsText = '['+
		'{"id":1,"question":"___________ and ___________ were our first parents","answer":"Adam and Eve","point":0},' + 
		'{"id":2,"question":"Who is the first son of Adam and Eve","answer":"Cain","point":0},' + 
		'{"id":3,"question":"The Apostles saw in Jesus the &lsquoglory of the only begotten ______ of the Father&rsquo","answer":"Son","point":0},' + 
		'{"id":4,"question":"Jesus was conceived in the womb of the _____ solely by the power of the Holy Spirit without the intervention of man. Which among the designation of Mary captures this reality?","answer":"Vergin","point":0},' + 
		'{"id":5,"question":"The New Adam is Christ, the Virgin is the New _____.  What designation of Mary is this?","answer":"Eve","point":0},' + 
		'{"id":6,"question":"Who is the second person of the Holy Trinity","answer":"Jesus Christ, the Son of God","point":0},' + 
		'{"id":7,"question":"The New Testament conveys to us the ultimate truth of divine revelation whose central object is Jesus Christ.<br/><br/>'+
			'a. This is true<br/>'+
			'b. This is false<br/>'+
			'c. This is partly true<br/>'+
			'd. None of the above<br/>'+
		'","answer":"a. This is true","point":0},'+
		'{"id":8,"question":"True or False:  Jesus is the Second person of the Blessed Trinity, the Father, the Son and the Holy Spirit.","answer":"True","point":0},' + 
		'{"id":9,"question":"The meaning of the word Adam is “earth”<br/><br/>'+
			'a. This is false<br/>'+
			'b. This is true<br/>'+
			'c. This is neither false or true<br/>'+
		'","answer":"b. This is true","point":0},'+
		'{"id":10,"question":"The three sons of Noah are Shem, ____ and Japhet","answer":"Ham","point":0},' + 
		'{"id":11,"question":"True or False: Mary is truly the Mother of God since she is the mother of Jesus, who is God himself and the eternal Son of God","answer":"True","point":0},' + 
		'{"id":12,"question":"Apostolic tradition is the transmission of the message of Christ by means of preaching, worship and inspired writings.<br/><br/>'+
			'a. This is correct<br/>'+
			'b. This is not correct<br/>'+
			'c. This is neither correct nor correct<br/>'+
			'd. None of the above<br/>'+
		'","answer":"a. This is correct","point":0},'+
		'{"id":13,"question":"The deposit of faith was entrusted to the ________________ of the Church.<br/><br/>'+
			'a. Priests<br/>'+
			'b. Laymen<br/>'+
			'c. Magisterium or teaching office<br/>'+
			'd. None of the above<br/>'+
		'","answer":"c. Magisterium or teaching office","point":0},'+
		'{"id":14,"question":"How many books are there in the OT and the NT","answer":"46 and 27","point":0},' + 
		'{"id":15,"question":"Man is the summit of visible creation since he was created in the image of God<br/><br/>'+
			'a. This is true<br/>'+
			'b. This is false<br/>'+
			'c. This is partly true<br/>'+
			'd. None of the above<br/>'+
		'","answer":"a. This is true","point":0},'+
		'{"id":16,"question":"The proclamation of Jesus Christ, the Son of the loving God is called <br/><br/>'+
			'a. Epistles<br/>'+
			'b. Gospel<br/>'+
			'c. Apocrypha<br/>'+
			'd. Deutero-canonical books<br/>'+
			'e. None of the aboce<br/>'+
		'","answer":"b. Gospel","point":0},'+
		'{"id":17,"question":"Who is the author of Sacred Scripture? ","answer":"God and Man","point":0},' + 
		'{"id":18,"question":"True or False: The spiritual soul does not come from our parents.  It is immediately created by God and is immortal or cannot die.","answer":"True","point":0},' + 
		'{"id":19,"question":"True or False: Even though we live in the New Testament times as inaugurated by Christ, the Old Testament is still indispensable or necessary. ","answer":"True","point":0},' + 
		'{"id":20,"question":"Why does God give an angel to each person? ","answer":"As Protector","point":0},' + 
		'{"id":21,"question":"True or false. Man is destined to reproduce the image of Christ in himself. ","answer":"True","point":0},' + 
		'{"id":22,"question":"The father of all who believe is: <br/><br/>'+
			'a. Abraham<br/>'+
			'b. David<br/>'+
			'c. Jesus<br/>'+
			'd. Paul<br/>'+
			'e. Adam<br/>'+
		'","answer":"a. Abraham","point":0},'+
		'{"id":23,"question":"The personal adherence of man to God, and the free assent to the whole truth that God has revealed, is called: <br/><br/>'+
			'a. Perseverance<br/>'+
			'b. Faith<br/>'+
			'c. Hope<br/>'+
			'd. Love<br/>'+
			'e. Belief<br/>'+
		'","answer":"B. Faith","point":0},'+
		'{"id":24,"question":"Of all human persons, who most perfectly embodies the obedience of faith? ","answer":"The Virgin Mary","point":0},' + 
		'{"id":25,"question":"True or False:  Man is created in the image of God since he is capable of knowing and loving the Creator in freedom.","answer":"True","point":0},' + 
		'{"id":26,"question":"True or false. Mary, conceived sinless, remained without sin throughout her life. ","answer":"True","point":0},' + 
		'{"id":27,"question":"The Immaculate Conception refers to: <br/><br/>'+
			'a. Jesus was conceived without sin by the Virgin Mary<br/>'+
			'b. Mary was conceived without sin by St Anne, her morther<br/>'+
			'c. Jesus’ freedom from sin from conception onwards. <br/>'+
			'd. the impregnation of Mary by the Holy Spirit. <br/>'+
			'e. Mary’s freedom from all stain of Original Sin from her conception.<br/>'+
		'","answer":"e. Mary’s freedom from all stain of Original Sin from her conception.","point":0},'+
		'{"id":28,"question":"Why is the Lord’s Prayer (the Our Father) a unique one? <br/><br/>'+
			'a.   It was Jesus himself who taught this prayer<br/>'+
			'b.  it is was prayed by many Popes in the past<br/>'+
			'c.  it was the prayer of the apostles<br/>'+
		'","answer":"a.   It was Jesus himself who taught this prayer","point":0},'+
		'{"id":29,"question":"The __________________ is the third Person of the Holy Trinity.","answer":"Holy Spirit","point":0},' + 
		'{"id":30,"question":"True or False: Faith in the incarnation is a distinctive sign of the Christian faith.","answer":"True","point":0}' + 
	']';
	return JSON.parse(questionsText);
}
