package com.acn.uaap.service;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/news")
public class NewsController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAll")
	public JSONObject getNews() {
		JSONObject newsObj = new JSONObject();

		try {
			JSONArray newsArray = new JSONArray();
			
			JSONObject schoolA = createSchoolObject("dlsu");
			
			JSONArray sportsA = new JSONArray();
			
			JSONObject sportsBBall = createSportsObject("basketball");
			
			JSONArray leagueA = new JSONArray();
			
			JSONObject leagueSeniors = createLeaguesObject("seniors");
			
			JSONArray newsA = new JSONArray();
			
			ArrayList<String> tagsA = new ArrayList<String>();
			tagsA.add("Feature");
			JSONObject newsObjA = createNewsObject("1686", 
					"La Salle early lead, a good sign for retaining overall title", 
					"http://uaapsports.tv/static/uploads/uaapsports.tv/535fe2f0563b491db4ddda89d16aece6.jpg", 
					"Nov 30th 2013", "Up and down the ledger, De La Salle University's dominance spoke volumes in the first semester alone.\n\nBut the second semester promises to create more noise for the green-and-white, a top La Salle sports officials said Friday, underscoring the Archers' chances of retaining the general championship trophy they wrested from multi-titled University of Santo Tomas (UST) last season.\n\n\"It looks like we have a good chance of keeping the general championship this season with our overall performance (in the first semester),\" La Salle's UAAP board representative Henry Atayde said.\n\n\"Last season, we we're just up by eight points after the first sem. This season, we ended up the first sem with a 16-point lead (against UST) so I think given that factor and our chances in the second semester, we can win (the general championship) anew.\"\n\nPropped up by victories in the centerpiece men's and women's basketball, La Salle tallied 162 points to lead the first half of the season.\n\n\"Winning the men's and women's basketball titles were big factors in our campaign. It really boosted our morale and gave us a big lift going into the second semester,\" Atayde added.\n\nFourteen straight and 38-time general champion UST wound up second with 146 points.\n\nUniversity of the Philippines (UP) came in third with a 133-point aggregate.\n\nLa Salle also ruled men's taekwondo, table tennis, and women's judo, while taking runner-up honors in men's swimming, women's badminton and table tennis. It placed third in men's judo, women's taekwondo and swimming.\n\nThe Tigers for their part won poomsae and women's taekwondo on top of second-place finishes in men's basketball, taekwondo, and men's and women's beach volleyball. UST occupied the third spot in men's badminton, women's basketball and table tennis.\n\nFor the first time though, the Tigers did not compete in women's swimming to protest the Temporary Restraining Order issued by a Quezon City court  which prevented the UAAP from enforcing its two-year residency rule on former UST high school standout Ana Dominique Bartolome.\n\nBartolome was eventually allowed to suit up for the UP swimming team in her rookie year despite not securing release papers from UST.\n\nDespite the ruckus, Atayde believes UST still has the numbers to overtake La Salle for the general championship plum.\n\n\"UST is a very strong team. The way I see it, they can challenge for the title in men's volleyball, football, and fencing. Of course, they're also defending champions in men's chess. No doubt, they will put up a good fight in all the remaining sports, but we are ready,\" he said.\n\nAtayde sees La Salle's title prospects blooming in men's and women's chess, women's football and women's volleyball, where the defending champion Lady Spikers are expected to mount a four-peat this season.\n\nUP meanwhile secured titles in men's and women's swimming, and women's table tennis.\n\nRounding up the standings are Ateneo de Manila University (125 points), Far Eastern University (78 points), National University (74 points), University of the East (68 points) and host Adamson University (51 points).\n\nEvery championship is worth 15 points with the rest as follows: second place, 12 points; third, 10 points; fourth, 8 points; fifth, 6 points; sixth, 4 points; seventh, 2 points; and eighth, 1 point.", 
					tagsA, "http://uaapsports.tv/sports-basketball-news-inner.html?ref=1686", 
					"Anthony Divinagracia");
			JSONObject newsObjB = createNewsObject("1519", 
					"By the Numbers: Finals Game 3", 
					"http://uaapsports.tv/static/uploads/uaapsports.tv/88c74c353b645fe99dc76291c6d7660a.JPG", 
					"Oct 15th 2013", "It was only fitting that the truly memorable season ended with a finals series for the ages. Both De La Salle University and University of Santo Tomas (UST) laid everything on the floor in hopes of adding more hardware to their trophy cases. But in the end, it was the boys from Taft who showed enough resolve and composure in crunch time to hack out a cardiac Game 3 victory. The Green Archers also duplicated their 1999 feat as they also claimed the crown despite losing in Game 1.\n\n23,396\n\nThe number of people who watched Game 3 at the Mall of Asia Arena—reportedly the biggest attendance in a UAAP basketball game in history. The state-of-the-art venue was split evenly with La Salle and UST fans filling the seats. It also set the record for the biggest crowd at the said venue. Games 1 and 2 held at the Smart-Araneta Coliseum drew 20,525 and 23,037, respectively. Nothing like a do-or-die to draw the fans.\n\n19\n\nThe age of Jeron Teng—the youngest UAAP Finals MVP in the new millennium. In just his second year, the explosive forward led La Salle to the crown after averaging 19.3 PPG, 8.0 RPG, and 3.7 APG in a notable all-around performance. In Game 3, he scored 19 of his team-high 25 points in the second half and overtime to power the Green Archers to victory. Ryan Buenafe is the second youngest after winning it in 2010 at 20 years old.\n\n4\n\nThe number of points scored by La Salle's Almond Vosotros in overtime. The crafty guard once again proved that he is one of the best clutch players in the league as he scored four of the Green Archers' six points in the extra period, including the game-winning jumper from the right baseline. Teng may get all the recognition and the attention, but La Salle wouldn't have its eighth title without Vostoros' laudable endgame heroics.\n\n3.3\n\nThe average winning margin of the best-of-three finals. La Salle and UST treated fans to a nail-biting series with all of the games going down the wire. In Game 1, the Growling Tigers won by just a solitary point. Then the Green Archers claimed Game 2 by seven, 77-70 and Game 3, which went to OT, by two, 71-69. It is the closest margin since the 2.0 of the 2005 Finals between La Salle and eventual winner Far Eastern University.\n\n4\n\nThe number of coaches in the Final Four era that led their team to the UAAP title in their first year. La Salle mentor Juno Sauler joined the almost exclusive list, which also includes his UST counterpart Pido Jarencio, former Ateneo de Manila University tactician Joel Banal and former DLSU mentor Franz Pumaren. Pumaren did it 1998 while the soft-spoken Banal first did it in 2002, snapping the five-peat hopes of archrival La Salle. Jarencio accomplished the feat in 2006 against Ateneo.", 
					tagsA, "http://uaapsports.tv/sports-basketball-news-inner.html?ref=1519", 
					"Paolo Mariano");
			JSONObject newsObjC = createNewsObject("1520", 
					"La Salle, UST make history in Game 3 by producing highest TV ratings ever for a UAAP event", 
					"http://uaapsports.tv/static/uploads/uaapsports.tv/9f9566f280a337be9775294dcc1fdc2b.jpg", 
					"Oct 15th 2013", "Last Saturday, October 12, 2013, the two finalists in the UAAP Season 76 Men's basketball tournament, De La Salle University and the University of Sto. Tomas figured in an epic winner-take-all Game 3 that saw the Green Archers prevail over the Growling Tigers in overtime, 71-69. After 5 tumultuous seasons, DLSU finally recaptured the championship it last won in 2007 (UAAP Season 70) and notched their eight title overall.\n\nOn top of that, a record crowd of 23,396 people were present at the Mall of Asia Arena in Pasay City to witness the memorable Game 3 encounter between the two proud institutions. That was the highest recorded attendance in the history of the basketball tournament in the UAAP.\n\nAs students, fans, alumni and supporters of the two schools cheered their hearts out inside the venue, countless others witnessed the event all over the country by tuning in to ABC-CBN Channel 2. With millions of sports fans around the archipelago glued to their TV sets, Game 3 of the UAAP Finals experienced its highest ratings ever for a UAAP event.\n\nAccording to Kantar Media, Game 3 generated a 15.3 rating, making it the highest rated program in its time slot, beating Startalk, which rated 7.6. Previously, the UAAP Finals reached a high of 10.1 in Game 2 only to be eclipsed seven days later by the Game 3 turnout.\n\nPrior to this season, the previous high was Game 1 of the 2011 UAAP Finals between Ateneo de Manila University and Far Eastern University, which rated at 9.76.\n\n2013 marks the fourth year that the UAAP Finals aired on ABS-CBN Channel 2.", 
					tagsA, "http://uaapsports.tv/sports-basketball-news-inner.html?ref=1520", 
					"Anton Roxas");
			JSONObject newsObjD = createNewsObject("1516", 
					"Archers capture UAAP title behind Vosotros heroics", 
					"http://uaapsports.tv/static/uploads/uaapsports.tv/433bf33c52e9f04cb5d590988bc2958b.jpg", 
					"Oct 12th 2013", "De La Salle University proved tough as nut on Saturday.\n\nOr better yet – tough as Almond.\n\nPressed and pressured all game long, Almond Vosotros unleashed the killer arrow straight into the hearts of Jeric Teng and the rest of the University of Santo Tomas (UST) faithful in crunchtime to guide La Salle back to the Promised Land of the 76th UAAP men's basketball tournament before a sea of green at the jampacked Mall of Asia Arena.\n\nVosotros ditched an open three-point attempt, faked and slipped past Teng from the right elbow before launching the game-winning baseline jumper with 19.7 seconds left in Game 3 as the Archers nipped the Tigers, 71-69,  in overtime to complete a sensational climb from 15 points down and win their first UAAP title since 2007.\n\nFinals MVP Jeron Teng led the Archers with an all-around output of 25 points, eight rebounds, and six assists but it was the patience and veteran smarts of the 5-foot-10 Vosotros which spelled difference in La Salle's no-more-tomorrow romp to the top.\n\nThe fourth-year guard chalked up 16 points despite going only 2-of-8 from three-point range while negotiating the menacing defense of Teng throughout the contest.\n\n\"Sayang yung binibigay sa akin na confidence ng mga coaches. Yung last shot ko siguro ang dami lang siguro nagpe-pray na pumasok yun,\" Vosotros said.\n\nLa Salle's bigs also did its share of damage anew with Mythical Five member Jason Perkins and Arnold Van Opstal tallying 13 and 11 markers, respectively for the Archers, who limited UST to just four points in overtime.\n\nPerkins capped his rookie season with 18 rebounds, including eight offensive boards.\n\nWith the victory, the Archers became the eighth team in the Final Four era to capture the series after losing Game 1. La Salle tied archrival Ateneo de Manila University with eight titles overall.\n\n\"Everyone just wanted to fight it out, even in the last five minutes in the overtime period. Some of them have been cramping up. I know we were down but they wanted to fight it out 'til the very end. They showed great fight in them,\" said La Salle coach Juno Sauler, who became the second coach in seven years to win a championship in his maiden season.\n\nIronically, Sauler achieved the feat at the expense of UST coach Pido Jarencio, the first rookie mentor to pull the act in 2006.\n\nUnable to settle on a rhythm from the get-go, the Archers found themselves trailing majority of the first half with Karim Abdul dominating the inside and Jeric Teng hitting back-to-back triples to ignite a telling 8-2 blitz and push UST up, 32-23, at the break.\n\nThe Tigers visibly outworked La Salle in the first 20 minutes of play, grabbing 27 rebounds, including 13 from the offensive glass while logging in nine assists and six steals.\n\nClark Bautista then joined Teng in the scoring fray come third quarter as they nailed a pair of baskets each to spark another 8-1 rush and give UST its biggest lead at 40-25.\n\nBut La Salle did not panic.\n\n\"I just told them to run and push the ball,\" Sauler said to his wards, who countered with a huge 18-4 run punctuated by triples from Vosotros and Thomas Torres to wrest the upperhand, 47-46 and the momentum entering the payoff period.\n\nUST mounted a 9-2 assault capped by a Jeric Teng triple to own a 59-54 lead with 5:23 in the fourth. Yet Jeron Teng refused to let his brother take over as he went on a seven-point swing, including a three-point play before cramping up at the 3:53 mark. His last basket in regulation knotted the count for the tenth time at 61-all with 2:22 left.\n\nKevin Ferrer canned two freethrows before Perkins and Jeron Teng made baskets each to hand La Salle a 65-63 lead with 1:03 in the clock.\n\nAljon Mariano banged in two more charities with 53 ticks to tie the game. La Salle could've finished the Tigers with plenty of time on its side but the Archers wasted crucial possessions at the turn – the last on Jeron Teng's drop pass to Van Opstal which sailed out of bounds.\n\nRegaining the ball off La Salle's timely miscues, the Tigers mapped out one last play with six second left. But the struggling Mariano, who received the inbound, opted to jack up a top-of-the-key triple that clanged out of the rim at the horn, forcing the extra session.\n\nVosotros quickly stole the lead for La Salle with an easy basket off a broken play to start the overtime period, 67-65.\n\nGassed up and showing little offensive activity in the next three minutes, the Tigers then burned their only timeout with 1:19 remaining to catch up.\n\nFerrer then converted a low-post play before Teng drilled in a go-ahead baseline floater with 34 seconds to carry UST up, 69-67.\n\nJeron Teng answered with a split inside the 50-second barrier before UST recovered the leather off a mad scramble for possession only for Mariano to spill as he threw a long pass which Ferrer failed to handle in the last 30 ticks of the contest, setting up Vosotros' ultimate heroics with the marginal jumper for a 70-69 edge.\n\n\"It just boiled down to multiple possessions. The players just showed discipline. It was a great learning experience,\" Sauler said.\n\nAbdul dished a workman-like effort in a losing cause for the Tigers with 26 points, eight rebounds, and three steals while Jeric Teng added 24 on 4-of-7 shooting from beyond the arc to cap an eventful UAAP career.\n\n\"After the game, I didn't know what to feel. On the one hand I'm celebrating because we're champions. On the other hand, I felt bad for my brother. He did his best. He played with all heart. I just wish him luck. For me, he is the (Finals) MVP,\" said Jeron of brother Jeric who fell on his knees in tears after failing to win the title anew in his second championship stint.\n\nIn yet another fine gesture of brotherly love and sportsmanship, Jeron approached Jeric at centercourt and hugged the graduating UST captain. Jeric then raised the hand of his younger brother in appreciation.\n\nFerrer, who was reportedly feeling ill before the game, wound up with just seven points on a forgettable 2-of-12 from the field while Mariano remained lost in the series to the very end, scoring just three - all on freethrows - and missing all his eight field goal attempts despite collecting ten rebounds in 32 minutes of play.\n\nThe scores:\n\nDLSU 71 – Teng 25, Vosotros 16, Perkins 13, Van Opstal 11, T.Torres 4, N. Torres 1, Revilla 1, Tampus 0, Salem 0.\n\nUST 69 – Abdul 26, Teng 24, Ferrer 7, Bautista 4, Mariano 3, Sheriff 2, Lao 2, Pe 1.\n\nQuarter scores: 16-18, 24-32, 47-48, 65-65, 71-69.", 
					tagsA, "http://uaapsports.tv/sports-basketball-news-inner.html?ref=1516", 
					"Anthony Divinagracia");
			JSONObject newsObjE = createNewsObject("1513", 
					"La Salle and UST battle for all the marbles in deciding Game 3", 
					"http://uaapsports.tv/static/uploads/uaapsports.tv/d132917164cc68c18c0e6a3ef6ce5c31.JPG", 
					"Oct 11th 2013", "Throw away the stats and the calendars as well.\n\nThere's no more tomorrow for De La Salle University and University of Santo Tomas (UST) in Season 76 of the UAAP men's senior basketball tournament.\n\nThe league on Saturday will crown a new champion as the Green Archers and the Growling Tigers duke it out in the much-awaited do-or-die Game 3 of the finals at the Mall of Asia Arena at 3:30 p.m.\n\nIn what has been a turbulent season littered with off-court distractions and controversies, it's only fitting that the league's top prize will be decided on the court in the last playing date of the year.\n\nThe Green Archers forced the winner-take-all after manhandling the Growling Tigers in Game 2, 77-70. They conquered the shaded lane, played excellent defense, and executed almost flawlessly to frustrate UST all game long.\n\nLa Salle, which had a stingy rotation of only seven players last Saturday, is expected to take advantage of its size anew in the decider. The squad will be led by the much well-rounded Jeron Teng and the three-headed monster frontline of Arnold Van Opstal, Norbert Torres, and Jason Perkins.\n\nIn Game 2, Van Opstal and Torres combined for 29 points and 24 rebounds, continuously imposing their will in the paint as if they purchased it. The second-year Teng, meanwhile, had his fingerprints all over the match with 19 points, nine rebounds, four assists, and three steals.\n\nIf the inside game doesn't work, there's always streak-shooting guard Almond Vosotros, who has a knack for playing well in big games.\n\n\"Like before, we'll still try to improve on the things we have to work on, especially on defense. We also need to lessen our turnovers,\" said La Salle head coach Juno Sauler.\n\nUST, on other hand, which escaped La Salle by a hairline in Game 1, will once again lean on its veteran core of Jeric Teng, Karim Abdul, Aljon Mariano, Kevin Ferrer, and Clark Bautista.\n\nThe graduating Teng has been on a tear in the series, averaging 22.5 PPG, including a career-high 28 points in a losing effort in Game 2. The do-it-all Ferrer, however, was conspicuously absent, finishing with only six points on 1-of-6 shooting after exploding for 20 markers in Game 1.\n\n\"Parang tumabla lang naman sila sa amin e, at least puwede pa kami makabalik (They just tied us, at least we can still bounce back),\" said UST head coach Pido Jarencio. \"Buhay pa kami (We're still alive), we just have to step up.\n\nThe outspoken tactician didn't namedrop but he could've easily been talking about Mariano, who has been a non-factor in the series. The versatile forward is only averaging 5.5 PPG on an atrocious 25.0% clip from the field. He has also only shot twice from the free throw line, underscoring his lack of aggressiveness. Prior to the championship, he was putting up 12.7 PPG.\n\n\"Actually, nung NU series (National University) pa nawawala si Aljon, siguro papaliguin ko muna siya sa Pagsanjan Falls para mawala 'yung malas (Aljon has disappeared since the NU series, maybe I'll ask him to bathe in Pagsanjan Falls to wash away his bad luck),\" jokingly said Jarencio.\n\nHe has also lamented the lack of production from his second unit, with UST only averaging 8.6 bench points in the series. That's why shock troopers, Jan Sheriff, Ed Daquioag, Paolo Pe, and Kim Lo should also step up if they want to avenge their finals setback last year.\n\nWhatever happens, it's the end of the season for the two teams, which trudged divergent roads on their way to the Last Dance.\n\nLa Salle breezed through the second round and Final Four before getting its nine-game winning streak snapped in Game 1. In contrast, UST had to move heaven and earth just to get to the ultimate round.\n\nThe series has been a feature of contrasting styles as well. The taller and heftier Green Archers like to pound the ball in the post, capitalizing on inside points with 44.0 a game, compared to UST's measly 20.0. The faster and more athletic Growling Tigers, on the other hand, like to run and shoot from the outside, doubling La Salle's perimeter points, 34.0 to 17.0.\n\nThe biggest factors in the series though have been offensive rebounds and second chance points, which La Salle has both dominated with norms of 22.5 and 15.0, respectively. UST, conversely, has only averaged 8.5 and 4.0—huge dips from its league-leading 15.8 and league second-best 10.4 in the elimination round.    \n\nBut as they say, stats don't really matter when it comes to a do-or-die, it's all about desire and mentality—something both coaches agreed on.\n\n\"Everything boils down to the mental aspect. (It's a battle) of who wants it more? We need to work on our mindset how to close out teams,\" said Sauler.\n\n\"The championship is all about mental toughness. Naturo ko na lahat ng play at drills sa kanila e (I've already taught them all the plays and drills). It all boils down to having the proper mindset,\" said Jarencio.\n\nIn the previous 19 title showdowns in the Final Four era, the winner of Game 1 went on to win the title 14 times. But in the preceding seven times the series was extended to a Game 3, the winner of Game 2 managed to take home the crown four times.\n\nLa Salle is looking for its eighth title, while UST hopes to become the lowest seed to capture the crown and tie Far Eastern University for the most in the league with 19.\n\nThe game will air live on ABS-CBN, BALLS HD 167, uaaplivestream.studio23.tv and iwantv.com.ph. It can also be heard on radio via DZMM 630 AM. The replays will air tonight at 9:30 p.m. on Studio 23 and at 10:30 p.m. on BALLS SkyCable channel 34 or Destiny Cable channel 36.", 
					tagsA, "http://uaapsports.tv/sports-basketball-news-inner.html?ref=1513", 
					"Paolo Mariano");
			JSONObject newsObjF = createNewsObject("1503", 
					"DLSU Lady Archers outduel NU in Game 3 to reclaim Women's basketball crown", 
					"http://uaapsports.studio23.tv/static/uploads/uaapsports.studio23.tv/9553a05330aa9496d9d790523ba14624.jpg", 
					"Oct 5th 2013", "After eleven years, the De La Salle University Lady Archers are once again champions in the Women's basketball tournament. DLSU defeated National University, 69-61 in Game Three of their best-of-three series in the UAAP Season 76 Finals on Saturday, October 5, 2013 at the Araneta Coliseum in Quezon City.\n\nTalented combo guard Trisha Piatos gave the Lady Archers its biggest lead of the game after knocking down a triple from the left wing to give her team a 62-45 lead with 6:05 to go in the fourth quarter.\n\nBut, the Lady Bulldogs were not ready to quit, as they went on a 15-2 run to come to within just four points, 64-60 at the 1:30 mark of the final period.\n\n\"We expected that (NU's comeback attempt). NU is probably the toughest team in the UAAP. They're the most talented. They dominated the eliminations. I think they have the most skilled players. I knew that they wouldn't just give up, lie down there and give it to us. We expected that but then, andun yung mental toughness ng players ko. We're not the best team. We're not the most talented. But if you ask me, we're the most mentally tough in the league,\" said DLSU head coach Tyrone Bautista after the game.\n\nAs NU came to within striking distance, DLSU pulled away, outscoring the Lady Bulldogs, 5-1 capped off by a fastbreak layup at the buzzer by graduating player Camille Ramos.\n\nDLSU's last women's title came in 2002, the last of four straight championships won by the Taft Ave. based institution. Bautista felt relieved to have finally completed the task at hand.\n\n\"It was really a process all throughout with several heartbreaks along the way pero hindi kami nawala sa focus namin. We just kept on working hard, improving, and I was confident na darating din yung time na we will be able to be the champions,\" said Bautista, who started his head coaching stint with the Lady Archers in 2009.\n\nThe Lady Archers started the game by making an effort to get Ara Abaca involved. And even though Abaca missed her first four shots, DLSU continued to give her opportunities on offense. Abaca finished with 16 points, 12 of which coming in the second half.\n\n\"I know what she (Abaca) is capable of doing. She'll have bad games but in the end, we need her. We have to have her in the game and that is why we kept on going to her until makuha niya yung tira niya and what made it easier was that the players bought into it. They knew that they needed Ara,\" said Bautista.\n\nAbaca earned her second straight Mythical Five selection during the awarding ceremony later in the day.\n\nOn the other hand, Piatos was was named MVP of the Finals with averages of 14.7 points, 5 rebounds, 2 assists and 2.3 steals per game in the series.\n\nBautista was extremely pleased with the performance of Piatos, who stands at 5'3\".\n\n\"The girl has tremendous heart. She has a big heart. She might be small but the girl is really so feisty and resilient. She kept fighting. Today, I think all the hard work that she put in to improve her craft was on full display today.\"\n\nA former Green Archers who played five UAAP season with DLSU, Bautista is extremely honored to have delivered to his alma matter,  a fifth Women's basketball crown.\n\n\"To the DLSU community: I would like to thank all of you, the alumni, the families, everybody. The OSD (Office of Sports Development), the Admin, Bro. Bernie (Oca) and Bro. Ricky (Laguda). I just want to thank them for continuing to believe in us. We went through a lot but they were there until the end.\"\n\nBox scores:\n\nDLSU 69 – Abaca 16, Piatos 15, Corcuera 10, Ong A. 8, Santos 5, Claro 5, Melendres 4, Ramos 2, Ong M. 2, Garcia 2.\n\nNU 61 – Paig 21, Bernardino 16, Abriam 7, Tongco 6, Gupilan 6, Bonleon 4, Escoto 1, Sison 0, Seno 0, Antiquiera 0.\n\nQuarter scoring: 15-13, 30-29, 53-40, 69-61.", 
					tagsA, "http://uaapsports.studio23.tv/sports-basketball-news-inner.html?ref=1503", 
					"Anton Roxas Posted");
			
			newsA.put(newsObjA);
			newsA.put(newsObjB);
			newsA.put(newsObjC);
			newsA.put(newsObjD);
			newsA.put(newsObjE);
//			newsA.put(newsObjF);
			
			
			leagueSeniors.put("news", newsA);
			leagueA.put(leagueSeniors);
			
			JSONObject leagueWomens = createLeaguesObject("womens");
			
			JSONArray newsWomens = new JSONArray();
			newsWomens.put(newsObjF);
			
			leagueWomens.put("news", newsWomens);
			
			leagueA.put(leagueWomens);
			
			sportsBBall.put("leagues", leagueA);
			sportsA.put(sportsBBall);
			
			
			schoolA.put("sports", sportsA);
			newsArray.put(schoolA);
			
			
			newsObj.put("news", newsArray);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newsObj;
	}
	
	private JSONObject createSchoolObject(String schoolName) throws JSONException{
		JSONObject school = new JSONObject();
		
		school.put("school", schoolName);
		
		return school;
	}
	
	private JSONObject createSportsObject(String sportsName) throws JSONException{
		JSONObject sports = new JSONObject();
		
		sports.put("sport", sportsName);
		
		return sports;
	}
	
	private JSONObject createLeaguesObject(String leaguesName) throws JSONException{
		JSONObject leagues = new JSONObject();
		
		leagues.put("league", leaguesName);
		
		return leagues;
	}
	
	private JSONObject createNewsObject(String postId, String postTitle, 
			String imgSrc, String datePublish, String body, ArrayList<String> tags, 
			String uri, String Author) throws JSONException{
		JSONObject news = new JSONObject();
		
		news.put("postID", postId);
		news.put("postTitle", postTitle);
		news.put("imageSrc", imgSrc);
		news.put("datePublish", datePublish);
		news.put("body", body);
		news.put("uri", uri);
		news.put("author", Author);
		
		JSONArray jsonTags = new JSONArray();
		for (int i=0; i<tags.size(); i++){
			jsonTags.put(tags.get(i));
		}
		news.put("tags", jsonTags);
		
		return news;
	}
}
