getQuestions = function(){
	var questionsText = '['+
		'{"id":1,"question":"True or False: “Christ” in Hebrew and “Messiah” in Greek means the “anointed one”","answer":"False","point":0},' + 
		'{"id":2,"question":"The council of ______ teaches that the Lord Jesus Christ is true God and true man","answer":"Chalcedon","point":0},' + 
		'{"id":3,"question":"The human will of Christ followed without opposition, the _______ will and is subject to it.","answer":"Divine","point":0},' + 
		'{"id":4,"question":"The enmity between the serpent and the woman / son in Gen 3:15 is called the Proto-_______.","answer":"Evangelium","point":0},' + 
		'{"id":5,"question":"The name of God as revealed to Moses is.<br/><br/>'+
			'a. I am who I am<br/>'+
			'b. I will be who I will be<br/>'+
			'c. Ehyeh asher ehyeh<br/>'+
			'd. None of the above<br/>'+
			'e. a, b and c<br/>'+
		'","answer":"e. a, b and c","point":0},'+
		'{"id":6,"question":"In addition to knowing the literary genres of Scripture itself, what other sources are needed in order to interpret the Scripture correctly? ","answer":"Read the Scripture within the living Tradition of the Whole Church","point":0},' + 
		'{"id":7,"question":"The illumination of the unity of the divine plan gained by discerning in God&lsquos works of the Old Covenant prefigurations of what he accomplished in the fullness of time in the person of his incarnate Son is called: <br/><br/>'+
			'a.  transubstantiation<br/>'+
			'b. inerrancy<br/>'+
			'c. impeccability<br/>'+
			'd. typology<br/>'+
			'e. inspiration<br/>'+
		'","answer":"d. typology","point":0},'+
		'{"id":8,"question":"Which is true? Besides the literal reading of Scripture, the spiritual reading of Scripture <br/><br/>'+
			'a. leads us to understand events by recognizing their significance in Christ<br/>'+
			'b. ought to lead us to act justly<br/>'+
			'c. allows us to view realities and events in terms of their eternal significance<br/>'+
			'd. none of the above<br/>'+
			'e. all of the above<br/>'+
		'","answer":"e. all of the above","point":0},'+
		'{"id":9,"question":"What are the three stages in the formation of the Gospels?","answer":"1) the life and teaching of Jesus 2) the oral tradition 3) the written Gospels.","point":0},' + 
		'{"id":10,"question":"The purpose of angels is to: <br/><br/>'+
			'a. be a messenger of God.<br/>'+
			'b. glorify God.<br/>'+
			'c. serve the accomplishment of the divine plan. <br/>'+
			'd. a and b<br/>'+
			'e. all of the above<br/>'+
		'","answer":"e. all of the above","point":0},'+
		'{"id":11,"question":"What is both the end for which man was created and the fundamental reason for his dignity? ","answer":"To know and love God, and to share in his life","point":0},' + 
		'{"id":12,"question":"Which are part of the state of “original justice”? <br/><br/>'+
			'a. Friendship with God. <br/>'+
			'b. Harmony with creation. <br/>'+
			'c. Harmony with himself. <br/>'+
			'd. Lack of suffering. <br/>'+
			'e. Infused knowledge.<br/>'+
			'Choose none, any, or all of the above<br/>' +
		'","answer":"a, b c, and d","point":0},'+
		'{"id":13,"question":"The laws inscribed in creation <br/>' + 
		  'a. are a sign of the faithfulness of God’s covenant. <br/>' + 
		  'b. are a principle of wisdom and a foundation of morality. <br/>' + 
		  'c. are only laws of nature that are distinct from the moral law. <br/>' + 
		  'd. a and b. <br/>' + 
		  'e. none of the above <br/>'+
		'","answer":"d, a, and b","point":0},'+
		'{"id":14,"question":"By faith, we can believe because: <br/>' + 
		  'a). the truth of our faith now appears as true and intelligible in the light of our natural reasoning powers.<br/>' + 
		  'b). of the authority of God himself who reveals them.<br/>' + 
		  'c). God&lsquos gift now enable us, by the leap of faith, to believe that which, in fact, is false.<br/>' + 
		  'd). God has now taken over our reason.<br/>' + 
		  'e). the miracles of Jesus have provided undeniable proof of his Godhood. <br/>' +
		'","answer":"b. of the authority of God himself who reveals them.","point":0},'+
		'{"id":15,"question":"To obtain eternal life: <br/><br/>'+
			'a. We must have the supernatural virtue of faith.<br/>'+
			'b. We must persevere in our faith.<br/>'+
			'c. Once we know God in faith, our salvation is assured.<br/>'+
			'd. Our faith must show itself in good works<br/>'+
			'e.  a, b, and d.<br/>'+
			'f. a and c. <br/>'+
		'","answer":"a, b, and d","point":0},'+
		'{"id":16,"question":"True or false. Because Mary was conceived without sin, she did not come under the condemnation we incurred from Adam and Eve, and so she had no need of redemption by Christ. ","answer":"False","point":0},' + 
		'{"id":17,"question":"Choose none, any combination, or all. Why did God want His Son to be born of a virgin? <br/><br/>'+
			'a. The Virgin Birth manifests God’s absolute initiative. <br/>'+
			'b. Because Jesus is the New Adam, who inaugurates the New Creation. <br/>'+
			'c. By the Virgin Birth, Jesus, the New Adam, ushers in the new birth of children adopted in the Holy Spirit through faith. <br/>'+
			'd. The Virgin Mary’s virginity is the sign of her faith unadulterated by any doubt. <br/>'+
			'e. It is the sign of the Virgin Mary’s undivided gift of herself to God’s will.<br/>'+
		'","answer":"All of the above","point":0},'+
		'{"id":18,"question":"Which is true? <br/><br/>'+
			'a. Mary is only the mother of Jesus’ human nature.<br/>'+
			'b. Mary is the mother of the second person of the Holy Trinity. <br/>'+
			'c. Mary is the mother of the human person Jesus, but not the second person of the Holy Trinity. <br/>'+
			'd. Mary is the mother of both the human person and the divine person. <br/>'+
			'e. None of the above.<br/>'+
		'","answer":"d. Mary is the mother of both the human person and the divine person.","point":0},'+
		'{"id":19,"question":"Three ways on how God revealed himself.  These are scripture, tradition and _______________. ","answer":"Magisterium","point":0},' + 
		'{"id":20,"question":"True or False: The history of salvation are depended on the various covenants of God.  The covenant is a contract.","answer":"False","point":0},' + 
		'{"id":21,"question":"True or False: On the first three days of creation, God created the “form”, “realm” or “containers”.","answer":"True","point":0},' + 
		'{"id":22,"question":"True or False:  God created everything from nothing or “ex-nihilo”.","answer":"True","point":0},' + 
		'{"id":23,"question":"On the seventh day, God  rested and blessed his creation.  This day is called the ____________.","answer":"Sabbath","point":0},' + 
		'{"id":24,"question":"The central mystery of Christian life and faith is the mystery of the _____________________.","answer":"Most Blessed Trinity","point":0},' + 
		'{"id":25,"question":"________________________ is the dispositions with which God leads his creatures toward their ultimate end.","answer":"Divine Providence","point":0},' + 
		'{"id":26,"question":"True or False: The angels were created good by God but they transformed into evil because by a free and irrevocable choice, they rejected God.","answer":"True","point":0},' + 
		'{"id":27,"question":"After man sinned, God did not abandon man.  God proclaimed that the Messiah shall come as redeemer.  The fall was otherwise known as<br/><br/>'+
			'a. The happy fault<br/>'+
			'b. The greatest evil<br/>'+
			'c. The disobedience of angels<br/>'+
			'd. None of the above<br/>'+
		'","answer":"a. The happy fault","point":0},'+
		'{"id":28,"question":"True or False:  Jesus has only one will, the human will.","answer":"False","point":0},' + 
		'{"id":29,"question":"Two principal witnesses of the obedience of faith are found in Sacred Scripture.  One is __________ who is called the Father of all who believe, and Mary who embodies in her life the perfect way of obedience of faith.","answer":"Abraham","point":0},' + 
		'{"id":30,"question":"True or False: The Holy Spirit proceeded from the Father and the Son.","answer":"True","point":0}' + 
	']';
	return JSON.parse(questionsText);
}
