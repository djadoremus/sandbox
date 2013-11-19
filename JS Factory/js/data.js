getQuestions = function(){
	var questionsText = '['+
		'{"id":1,"question":"Church refer to the people whom God calls and gathers togeter, who through faith and baptism became <br/><br/>'+
			'A. Children of God<br/>'+
			'B. Members of Christ<br/>'+
			'C. Temples of the holy Spirit<br/>'+
			'D. All of the above<br/>'+
		'","answer":"D. All of the above","point":100},'+
		'{"id":2,"question":"Images about the church in the Old Testament is PEOPLE OF GOD.  In the New Testament, various images are used: Body of Christ, Image in pastoral life (sheepfold, flock), Images from agriculture (field, olive grove), Images  from construction (dwelling place, stone, temple) and From family (mother, family)<br/><br/>'+
			'A. These are all true<br/>'+
			'B. Some of these are not true<br/>'+
			'C. All of these are false<br/>'+
			'D. None of the above<br/>'+
		'","answer":"A. These are all true","point":300},'+
		'{"id":3,"question":"The origin and fulfillment of the church is in the eternal __________ of God.","answer":"Plan","point":100},' + 
		'{"id":4,"question":"The mission of the church is to proclaim and establish the _________________ established by Jesus Christ among all people.","answer":"Kingdom of God","point":300},' + 
		'{"id":5,"question":"The church is the universal sacrament of salvation since she is the sign  for the reconciliation and communion of all humanity with God and the unity of the entire human race.<br/><br/>'+
			'A. This is all true<br/>'+
			'B. This is partly true since she is also the sign and the instrument<br/>'+
			'C. This is patently false<br/>'+
			'D. None of the above<br/>'+
		'","answer":"B. None of the above","point":500},'+
		'{"id":6,"question":"What is the destiny of the church?","answer":"Kingdom of God","point":400},' + 
		'{"id":7,"question":"The three functions of Christ is as Priest, prophet and king. In so far as the baptized are consecrated by the Holy Spirit to offer spiritual sacrifices, we share in the  function of Christ as ___________","answer":"Priest","point":200},' + 
		'{"id":8,"question":"The intimate way by which the risen Christ is united to his people by means of the Holy Spirit, makes the ____________, the body of Christ.","answer":"Church","point":300},' + 
		'{"id":9,"question":"Who is the head of his body the church?","answer":"Christ","point":200},' + 
		'{"id":10,"question":"The church is called  the _______ of Christ since the Lord himself is called he Spouse (Mk 2:19).","answer":"Bride","point":200},' + 
		'{"id":11,"question":"The Church is called the __________ of the Holy Spirit since He resides in the church.","answer":"Temple","point":300},' + 
		'{"id":12,"question":"The special gifts given by the Holy Spirit for the good of others are called ______________.","answer":"Charism","point":400},' + 
		'{"id":13,"question":"In the unity of the church, she has one, faith, one sacramental life, one _______________ succession, one common hope and one and the same charity.","answer":"Apostolic","point":500},' + 
		'{"id":14,"question":"The church founded by Christ subsist in the ___________________ governed by the successor of Peter and the bishop in communion with him.","answer":"Catholic Church","point":400},' + 
		'{"id":15,"question":"For members of  non-catholic Christian groups, they are incorporated into Christ by Baptism and so we recognize them as _____________.","answer":"Brothers","point":200},' + 
		'{"id":16,"question":"How is the Church holy?  She is holy insofar as the Most Holy God is her ______.","answer":"Author","point":400},' + 
		'{"id":17,"question":"Insofar as Christ is present in the church, the church is Catholic which means  _______________.","answer":"Universal","point":200},' + 
		'{"id":18,"question":"The community in communion with Rome are called PARTICULAR church, which is catholic, is designated as diocese or eparchy.<br/><br/>'+
			'A. This is false<br/>'+
			'B. This is true<br/>'+
			'C. This is neither true nor false<br/>'+
			'D. None of the above<br/>'+
		'","answer":"B. This is true","point":500},'+
		'{"id":19,"question":"All who have communion with Rome belongs to the Catholic Church.  Those ___________ but do not fully enjoy unity with the Catholic church  are in a certain way in communion with her.","answer":"Baptized","point":500},' + 
		'{"id":20,"question":"To the _________ people belongs the “sonship, the glory, the covenants, the giving of the law….” (Rom 9:4,5)","answer":"Jewish","point":400},' + 
		'{"id":21,"question":"For other non-Christian groups, the church recognizes that whatever is _____ or true in them comes from God and is a reflection of his truth.","answer":"Good","point":400},' + 
		'{"id":22,"question":"Only through the church can one find salvation.  However, those who through no fault of their own, do not know the gospel but  sincerely seek God they can attain eternal _________.","answer":"Salvation","point":200},' + 
		'{"id":23,"question":"The church must proclaim the gospel to the whole world as commanded by Christ (Matt 28:19) because God desires ______ men to be saved (1 Tim 2:4)","answer":"All","point":100},' + 
		'{"id":24,"question":"Being a missionary church, the Christians must proclaim the Good News to ____________.<br/><br/>'+
			'A. Only the children<br/>'+
			'B. Only the adults<br/>'+
			'C. Everyone<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Everyone","point":100},'+
		'{"id":25,"question":"In her origin the church is __________________, since he was built on the “foundation of the apostles (Eph 2:20).<br/><br/>'+
			'A. Holy<br/>'+
			'B. One<br/>'+
			'C. Catholic<br/>'+
			'D. Apostolic<br/>'+
		'","answer":"D. Apostolic","point":200},'+
		'{"id":26,"question":"_____________________ means “one sent”","answer":"Apostle","point":300},' + 
		'{"id":27,"question":"__________________________ is the transmission by means of the sacrament of Holy Orders, the mission and power of the Apostles to their successors.","answer":"Apostolic succession","point":300},' + 
		'{"id":28,"question":"Those who have been incorporated in Christ through baptism are called the Christian ________.<br/><br/>'+
			'A. Members<br/>'+
			'B. Faithful<br/>'+
			'C. Brothers<br/>'+
			'D. None of the above<br/>'+
		'","answer":"B. Faithful","point":100},'+
		'{"id":29,"question":"The people of God are formed by consecrated ministers who received Holy Orders and forms the hierarchy of the Church.  The other members of the church are called __________.<br/><br/>'+
			'A. Pastors<br/>'+
			'B. Ministers<br/>'+
			'C. Laity<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Laity","point":200},'+
		'{"id":30,"question":"The sacred ministers forming the hierarchy consist of bishops, priests and ___________.<br/><br/>'+
			'A. Laity<br/>'+
			'B. Prophets<br/>'+
			'C. Lectors<br/>'+
			'D. Deacons<br/>'+
		'","answer":"D. Deacons","point":200},'+
		'{"id":31,"question":"Every bishop exercises his ministry as member of the episcopal college in communion with the ______.<br/><br/>'+
			'A. Laity<br/>'+
			'B. Priests<br/>'+
			'C. Deacons<br/>'+
			'D. Pope<br/>'+
		'","answer":"D. Pope","point":300},'+
		'{"id":32,"question":"_____________ exercise their ministry in the presbyterate of the local church in communion with his own bishop.<br/><br/>'+
			'A. Lector<br/>'+
			'B. Lay Minister<br/>'+
			'C. Choir<br/>'+
			'D. Priest<br/>'+
		'","answer":"D. Priest","point":400},'+
		'{"id":33,"question":"__________________ is the perpetual, visible source and foundation of the unity of the church.<br/><br/>'+
			'A. Hierarchy, eparchy, diocese<br/>'+
			'B. Pope, bishop of Rome, and Successor of Peter<br/>'+
			'C. Lay ministers, lectors and choir member<br/>'+
			'D. None of the above<br/>'+
		'","answer":"B. pope, bishop of Rome and successor of Peter","point":400},'+
		'{"id":34,"question":"__________________ in union with the Pope, and never without him,  also exercises supreme and full authority over the church.<br/><br/>'+
			'A. College of priests<br/>'+
			'B. College of fishermen<br/>'+
			'C. College of bishops<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. College of bishops","point":500},'+
		'{"id":35,"question":"The bishops in union with the pope consist of the teaching office of the church called the ____________.<br/><br/>'+
			'A. Magistrate<br/>'+
			'B. Magisterium<br/>'+
			'C. Magna cum laude<br/>'+
			'D. None of the above<br/>'+
		'","answer":"B. Magisterium","point":500},'+
		'{"id":36,"question":"In virtue of his office as supreme pontiff of the church, the pope can exercise ______________ in proclaiming a doctrine pertaining to faith and morals. ","answer":"Infallibility","point":500},' + 
		'{"id":37,"question":"Bishops sanctify the church by the sacraments especially _______________________.<br/><br/>'+
			'A. The bible<br/>'+
			'B. The rosary<br/>'+
			'C. The Holy Eucharist<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. The Holy Eucharist","point":300},'+
		'{"id":38,"question":"A local bishop governs a particular church based on his own sacred powers which is ordinary and immediate and exercised in the name of Christ.  That is why, the bishop of a local church is called the __________.<br/><br/>'+
			'A. Extraordinary<br/>'+
			'B. Supreme<br/>'+
			'C. Ordinary<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Ordinary","point":200},'+
		'{"id":39,"question":"The laity has as their vocation the illuminating and ordering _____________ affairs according to the plan of God.<br/><br/>'+
			'A. Spiritual<br/>'+
			'B. Moral<br/>'+
			'C. Temporal<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Temporal","point":200},'+
		'{"id":40,"question":"Laity participates in the sacrifice by offering their own lives, and others so that, dedicated to Christ and consecrated by the Holy Spirit, offer to God the ____________ itself.<br/><br/>'+
			'A. Money<br/>'+
			'B. Talent<br/>'+
			'C. World<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. World","point":300},'+
		'{"id":41,"question":"The laity participate in the prophetic office of the church through<br/><br/>'+
			'A. Proclaiming the Word of God<br/>'+
			'B. Having faith in the Word of God<br/>'+
			'C. Witnessing through, words, actions<br/>'+
			'D. All of the above<br/>'+
		'","answer":"D. All of the above","point":200},'+
		'{"id":42,"question":"A life that participates in the mission of the Church by means of a complete dedication to Christ and to one’s brothers and sisters  is called consecrated __________.<br/><br/>'+
			'A. Host<br/>'+
			'B. Scapulars<br/>'+
			'C. Life<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Life","point":400},'+
		'{"id":43,"question":"The common  sharing of all members of the Church in holy things: faith, sacraments, charism and other spiritual gifts is called _________________________<br/><br/>'+
			'A. Communion of saints<br/>'+
			'B. Communion on bread and wine<br/>'+
			'C. Communion of persons<br/>'+
			'D. None of the above<br/>'+
		'","answer":"A. Communion of Saints","point":400},'+
		'{"id":44,"question":"Communion of saints also refer to sharing of persons who by grace are united to the dead and risen Christ.  The pilgrims are with the Church militant, those who undergo _______________ are with the Church suffering and those in heaven are with the Church Triumphant<br/><br/>'+
			'A. Torture<br/>'+
			'B. Hell fire<br/>'+
			'C. Purification<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Purification","point":300},'+
		'{"id":45,"question":"In the order of grace, Mary is the mother of the ____________.<br/><br/>'+
			'A. Assembly<br/>'+
			'B. Fellowship<br/>'+
			'C. Church<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Church","point":200},'+
		'{"id":46,"question":"Mary is the ____________ of faith<br/><br/>'+
			'A. Initiator<br/>'+
			'B. Model<br/>'+
			'C. Focus<br/>'+
			'D. None of the above<br/>'+
		'","answer":"B. Model","point":100},'+
		'{"id":47,"question":"We are devoted to Mary in a special way but differs from the cult of _______________ which is directed to God alone.<br/><br/>'+
			'A. Veneration or hyperdulia<br/>'+
			'B. Honoring or dulia<br/>'+
			'C. Adoration or latria<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Adoration or latria","point":500},'+
		'{"id":48,"question":"For those who sin after baptism, the Christ instituted the sacrament of _______________ which reconciles the sinner with God.<br/><br/>'+
			'A. Baptism<br/>'+
			'B. Holy Order<br/>'+
			'C. Reconciliation or Penance<br/>'+
			'D. None of the above<br/>'+
		'","answer":"C. Reconciliation or Penance","point":200},'+
		'{"id":49,"question":"The church has the power to forgive sins since Christ himself conferred it upon her (Jn 20:22-23)<br/><br/>'+
			'A. This statement is true<br/>'+
			'B. This statement is essentially false<br/>'+
			'C. This is irrelevant<br/>'+
			'D. None of the above<br/>'+
		'","answer":"A. This statement is true","point":100},'+
		'{"id":50,"question":"In preparation for the coming for Christ, God prepared men for the expectation of this coming.  This reached its highest point when John the _______  came and announced his coming.","answer":"Baptist","point":100},' + 
		'{"id":51,"question":"True or False:  At Christmas, the glory of heaven is shown in the weakness of a baby","answer":"True","point":100}' + 
	']';
	return JSON.parse(questionsText);
}
