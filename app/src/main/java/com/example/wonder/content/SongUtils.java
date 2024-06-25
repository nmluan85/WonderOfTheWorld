
/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.wonder.content;

import com.example.wonder.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample song content.
 */

public class SongUtils {

    // An ArrayList of Songs
    public static final List<Song> SONG_ITEMS = new ArrayList<>();

    // The ID for the index into song titles.
    public static final String SONG_ID_KEY = "item_id";

    // The number of songs.
    private static final int COUNT = 7;

    /**
     * A Song item represents a song title, and song details.
     */
    public static class Song {
        public final String song_title;
        public final String details;
        public final int mImageResId;

        private Song(String content, String details, int mImageResId) {
            this.song_title = content;
            this.details = details;
            this.mImageResId = mImageResId;
        }
    }

    /**
     * Add an item to the array.
     *
     * @param item Each song
     */
    private static void addItem(Song item) {
        SONG_ITEMS.add(item);
    }

    static {
        // Fill the array with songs.
        for (int i = 0; i < COUNT; i++) {
            addItem(createSongAtPosition(i));
        }
    }

    /**
     * Manually creates each song title and song detail.
     *
     * @param position Position of the song in the list.
     * @return
     */
    private static Song createSongAtPosition(int position) {
        String newTitle;
        String newDetail;
        int mImageResId;
        switch (position) {
            case 0:
                mImageResId = R.drawable.menu_great_wall;
                newTitle = "The Great Wall of China";
                newDetail = "The Great Wall of China is comprised of series of walls, watchtowers, and beacon towers totaling almost 13,000 miles in length. It has been acknowledged by UNESCO as the largest man-made structure on earth. Its average height is 7m high, and its average width is 6m.\n" +
                        "\n" +
                        "* Why was the Great Wall of China built?\n" +
                        "In the history of China, the warring states era has great significance. During this era, seven major states - Qin, Han, Wei, Zhao, Qi, Chu, and Yan, fought against each other for superiority.\n" +
                        "\n" +
                        "After almost three centuries of warfare, the warring states era ended in 221 B.C. with Qin's victory. The king of Qin, Qin Shi Huang, combined all these states and formed the first unified Chinese empire. \n" +
                        "\n" +
                        "Once Qin Shi Huang became the first emperor of unified China, he ordered the construction of fortified wall in the north, which would protect China from nomadic invaders. On his orders, the existing stone and earth walls (built between 8th and 3rd century B.C. by the warring states to protect themselves from one another) were combined into a single system. This wall would later come to be known as the Great Wall of China. \n" +
                        "\n" +
                        "Even though the Qin dynasty had achieved the impossible dream of unifying China, the dynasty itself didn't last long. Indeed, the Qin dynasty fell within two decades. But even though the Qin dynasty was no more, the wall built by it was repaired, rebuilt, and further extended by successive dynasties until 1868A.D.\n" +
                        "\n" +
                        "Very little of the original wall constructed by the Qin dynasty remains today. Most of the Great Wall of China, as it exists today, was built by the Ming dynasty between 1368A.D. and 1644A.D.\n" +
                        "\n" +
                        "* Function\n" +
                        "\n" +
                        "The Qin dynasties originally built the Great Wall of China to protect China from nomadic invaders. The watchtowers and beacon towers in the wall not only served as defensive structures but also as lookouts. Soldiers guarding a watchtower could report an incoming attack to other watchtowers using signal fires.\n" +
                        "\n" +
                        "At times, when China's borders extended beyond the Great Wall, emperors armed it with soldiers to protect traders using the silk route.\n" +
                        "\n" +
                        "* How long did it take?\n" +
                        "\n" +
                        "The Great Wall of China is the longest construction project undertaken by humans. It took millions of workers from several dynasties and different periods more than 2500 years to finish the wall. Several hundreds of thousands (if not millions) of workers died during its construction. Many of their bodies were buried within the wall.\n" +
                        "\n" +
                        "\n" +
                        "* Current problems\n" +
                        "\n" +
                        "After the fall of the Ming dynasty, the Chinese started seeing the Great Wall as a symbol that portrayed China's insecurity to the whole world. So, they neglected it and stopped maintaining it properly. Hence natural wear and tear started eroding the wall.\n" +
                        "\n" +
                        "In the 1960s, during Mao Zedong's rule, officials even encouraged people to dismantle the wall and use the bricks to build houses.  \n" +
                        "\n" +
                        "As a result, almost three-fourths of the Great Wall, built during the Ming dynasty, is in danger today. One-third of the Great Wall has even completely disappeared. Only 8.2% of the Great Wall has been preserved properly. ";
                break;
            case 1:
                mImageResId = R.drawable.menu_christ_the_redeemer;
                newTitle = "Christ, the Redeemer";
                newDetail = "MChrist, the Redeemer, is one of the seven wonders of the world and a symbol of Brazilian Christianity. It is located in the city of Rio de Janeiro. Standing 30m tall on the summit of Mount Corcovado, it is the fifth-largest Statue of Jesus in the world. The horizontally outstretched arms spanning 28m make it look as if Jesus is welcoming everyone with open arms.\n" +
                        "\n" +
                        "* Why was it built?\n" +
                        "\n" +
                        "In the 1850s, Christian priest proposed placing a massive statue of Jesus Christ in Rio de Janeiro. However, his proposal was not accepted. \n" +
                        "\n" +
                        "In 1921, the Roman Catholic society in Rio became alarmed by the declining religious faith among Brazilians. They wanted to make Brazilians start believing in Christianity once again. \n" +
                        "\n" +
                        "So, they made a second proposal to build a statue of Jesus on the summit of Mount Corcovado. The Mount Corcovado is 704m high. If the statue was built on top of it, this statue would be visible from anywhere in Rio. By placing such a religious symbol in Brazil's (then) capital city, they hoped to kill the increasing godlessness and win back the citizens' faith in Christianity.\n" +
                        "\n" +
                        "To gather support for building the statue, the catholic circle organized an event to collect donations and signatures. The citizens, who became aware of the proposal, now petitioned the president to permit them to build the statue. Soon, the president granted permission. \n" +
                        "\n" +
                        "So, in 1922, competition was held to select a design for the statue. Among several competing designs, the design of Jesus with open arms was chosen. \n" +
                        "\n" +
                        "Once the design was selected, several designers started working together to build the statue. They made the statue using reinforced concrete. They built the outer layer using soapstone tiles. Soapstone was chosen because it is easy to carve while being durable and heat-resistant at the same time. It was also abundant in that area.\n" +
                        "\n" +
                        "Nine years, 6 million soapstone tiles, and $250,000 (now, 3.2 million U.S. dollars) later, the statue was completed. \n" +
                        "\n" +
                        "After its completion, the statue was opened to the public on October 12, 1931. Visible from anywhere in Rio, the statue sent message to the citizens of Rio, that Jesus was welcoming them with open arms. Soon, the statue became a symbol of Brazilian Christianity and global peace.\n" +
                        "\n" +
                        "* How long did it take?\n" +
                        "\n" +
                        "It took nine years to finish building Christ, the Redeemer.\n" +
                        "\n" +
                        "\n" +
                        "* Current problems\n" +
                        "Due to its location on the top of the mountain, it is prone to strong winds, erosion, and lightning attacks. Indeed, it gets hit by lightning around three to six times a year. In 2008, lighting hit the statue and damaged the head, eyebrows, and fingers. \n" +
                        "\n" +
                        "Due to these problems, maintenance is done periodically, and restoration work is carried out when needed. However, the white stone which was originally used to build the statue is in high-demand now. So, during restoration works, a dark-colored variation is often used. Therefore, Christ, the Redeemer, is becoming darker gradually.";
                break;
            case 2:
                mImageResId = R.drawable.menu_petra;
                newTitle = "Petra";
                newDetail = "Petra was a flourishing city in Jordan two thousand years ago. Built in an arid, rocky desert, it served as an important trade center. However, somewhere around the seventh century A.D., its people abandoned the city. Since then, it had been forgotten and remained hidden for more than thousand years, until the 19th century. \n" +
                        "\n" +
                        "In 1806, the African association, an English club created for the discovery of interior parts of Africa, assigned a Swiss adventurer the job of penetrating the Muslim dominated region of Sudan. Since foreign Christians could be executed for entering the Ottoman Empire, the Swiss adventurer disguised himself as a Persian pilgrim and traveled from England to Syria.\n" +
                        "\n" +
                        "In 1812, on his way from Syria to Cairo (Egypt), he heard rumors of city in ruins, that was close to a tomb. This rumor made him curious. So, on the pretext of sacrificing a goat, he asked his guide to take him to the tomb. When he passed through the narrow valley and finally set his eyes on the ruined city, he was mesmerized. He deduced that this city could only be Petra, the ancient city whose wealth was envied even by the Romans. He instantly knew that it was a wonder that deserved to be remembered for eternity.\n" +
                        "\n" +
                        "* Why was it built?\n" +
                        "The Nabateans were a tribe of people who lived in tents in the Arabian deserts (present-day Jordan). They moved along with their herd from one place to another in search of grass and water. \n" +
                        "\n" +
                        "Due to their life in arid deserts, they developed an intrinsic knowledge of hydraulic engineering. They dug tanks in the ground to store water, starting with a narrow hole and making it wider as they dug deeper. When it rained, the water went through the narrow opening and filled the tank. When the tank got full, they closed the opening and left signs known only to their tribe. This efficient storage of water in the arid desert gave them two benefits - Wealth and Power. \n" +
                        "\n" +
                        "- Power\n" +
                        "Whenever a battle broke out, they would hide themselves and use the water stored in these tanks to quench their thirst. They would then wait until their enemies eventually surrender due to the lack of water. By fighting this way, they soon developed an efficient and well-organized military that defended them against bigger powers. \n" +
                        "\n" +
                        "- Wealth\n" +
                        "Due to their efficient use of water, they could transport goods more efficiently and quicker than their competition. So, they started trading aromatic items, used to make scents and incense, along the Incense trade route (a network of ancient trade routes used for trading Arabian, African, East Asian, and Indian goods). Since these aromatic items were in great demand in Egypt, Rome, and Babylon, they quickly became richer and accumulated lot of wealth.\n" +
                        "\n" +
                        "This wealth helped them control several cities along the Incense trade route by the third century B.C. These cities became important stop points in the Incense route, where the traders, making the 65-day one-way travel journey to Gaza (Egypt), would rest for the night and trade their goods. Due to the amount of trade happening in these cities, the Nabateans became even wealthier.\n" +
                        "\n" +
                        "They eventually levied taxes from these travelers by building forts along the routes and guaranteeing them safety. Now they were so rich that the neighboring empires started envying their wealth. But their wealth came from their main source - travelers and traders. So, to offer better protection for the traders and oversee their own tax caravans, they built the city of Petra.\n" +
                        "\n" +
                        "* How long did it take?\n" +
                        "The construction of the entire city of Petra is supposed to have been finished within a span of 100 years.\n";
                break;
            case 3:
                mImageResId = R.drawable.menu_taj_mahal;
                newTitle = "Taj Mahal";
                newDetail = "Of all the world wonders, the Taj Mahal, located in Agra, India, is considered the symbol of love by most people on earth. It was built by the Mughal emperor Shah Jahan in memory of his favorite wife, Mumtaz Mahal.\n" +
                        "\n" +
                        "* Why was it built?\n" +
                        "\n" +
                        "The Mughal empire is said to have been founded by Babur, descendent of Timur, the undefeated military general, tactician and first ruler of the Timurid dynasty, and Gengis Khan, the founder and first emperor of the Mongol empire. \n" +
                        "\n" +
                        "After being ousted from his ancestral lands in central Asia, Babur went to Kabul (Afghanistan) and established himself there. Pushing downwards from Kabul, he conquered several parts of India and eventually created the Mughal empire. His successors followed in his footsteps, conquering many parts of India and expanding the Mughal empire. \n" +
                        "\n" +
                        "At times, to expand their empire without shedding blood, they even married princesses from other kingdoms. Thus, many of the Mughal emperors had many wives. \n" +
                        "\n" +
                        "The fifth emperor of the Mughal empire, Shah Jahan, was no different. He had many wives, and most of his marriages were political. But his marriage with Mumtaz Mahal, a Persian woman from Iran, was different. It was born out of love. Indeed, his love for Mumtaz was said to be so great that he stopped having emotional or sexual relationships with his other wives. Even though their love for each other was so great, sadly, in 1631, while delivering their 14th child, Mumtaz died. \n" +
                        "\n" +
                        "Shah Jahan was heartbroken. Unable to forget his wife, he commissioned the construction of a tomb in memory of her. Under his orders, the construction of the Taj Mahal started in 1632 and finished in 1653.\n" +
                        "\n" +
                        "The Taj Mahal is truly wonder of the world. It was built on the banks of the Yamuna river. The marbles used to build the Taj Mahal were inlaid with 28 kinds of rare stones and metals. \n" +
                        "\n" +
                        "The Taj Mahal is 68m high. The four minarets surrounding it are 43m tall. Shah Jahan didn't want the minarets to fall on the Masuoleum in the event of an earthquake. So, the minarets were built tilted at an angle of 2.5° facing away from the Mausoleum, so that in case of an earthquake, the minarets would fall on the opposite side of the Mausoleum. \n" +
                        "\n" +
                        "Upon its completion, the Taj Mahal, including its complex, was almost perfectly vertically symmetrical, when seen from the main entrance.\n" +
                        "\n" +
                        "However, 13 years later, when Shah Jahan died, his tomb was placed on the left side in the Mausoleum. Today, his tomb is the only structure that spoils the Taj Mahal's symmetry. But if so much effort was taken by Shah Jahan to make the Taj Mahal symmetrical, why was his own tomb placed in a way to spoil it?\n" +
                        "\n" +
                        "The Black Taj Mahal\n" +
                        "Legend has it that Shah Jahan planned to build a black Taj Mahal on the opposite side of the Yamuna river to serve as his own tomb. The moonlight garden, located on the other side of the Yamuna river, is perfectly aligned with the gardens of the Taj Mahal. People speculate that this is the place where Shah Jahan wanted to build the black Taj Mahal.\n" +
                        "\n" +
                        "But before he could begin its construction, he was overthrown from his throne by his third son, Aurangazeb, and was imprisoned by him. Most modern historians have dismissed the legend of the black Taj Mahal as rumor. However, if it were true, and had Shah Jahan managed to pull it off, it would have added another layer of symmetry to the already symmetrical White Taj Mahal. \n" +
                        "\n" +
                        "\n" +
                        "* How long did it take?\n" +
                        "Employing 20,000 workers, the construction of the Taj Mahal and its complex took 22 years.";
                break;
            case 4:
                mImageResId = R.drawable.menu_machu_pichu;
                newTitle = "Machu Pichu";
                newDetail = "Located in the Andes Mountains in Peru, Machu Pichu truly deserves its spot as world wonder. Known only to few locals, this mysterious city made of rock remained hidden from the outside world for five centuries.\n" +
                        "\n" +
                        "* Discovery of Machu Pichu\n" +
                        "\n" +
                        "The Incas were fierce warriors. Until the 15th century, they lived in their small kingdom (the city of Cusco in Peru). In 1438, their ninth king Pachacuti Inca Yupanqui started expanding their kingdom through conquest and eventually founded the Inca empire. Under Pachacuti and his successors, the Inca empire subjugated dozens of kingdoms in South America and (at its prime) stretched for more than 4000km along the Pacific coast. \n" +
                        "\n" +
                        "Despite the Incas being fierce warriors, the Inca Empire lasted only for hundred years. The Inca empire gradually weakened due to Smallpox and civil wars, until the Spanish invasion in 1532. \n" +
                        "\n" +
                        "Due to the Spanish invasion, the king of the Incas at that time moved his capital to Vitcos. Soon the Spanish raided Vitcos, killing many Incas. So, the Inca king and his supporters moved to Vilcabamba, which was in a remote area within the forests. There they defended against the Spanish for 35 years until 1572. However, in 1572, the Spanish forces successfully captured Vitcos and Vilcabamba, ending the Inca empire. \n" +
                        "\n" +
                        "After several years, due to the lack of written records and the absence of inhabitants, the locations of these two cities were forgotten. For adventurers around the world, Vilcabamba came to be known as the lost city of the Incas, which held reserves of treasure hidden by the Incas. \n" +
                        "\n" +
                        "Almost 340 years later, in 1911, the American explorer Hiram Bingham set on to find Vitcos and Vilcabamba. During his search, he was led to Machu Pichu by a local villager. He mistook this city for Vilcabamba, the last capital and lost city of the Incas. Soon, Machu Pichu became famous as the lost city of the Incas. \n" +
                        "\n" +
                        "After discovering Machu Pichu, Bingham continued his search and discovered two more Inca cities, one of which he identified as Vitcos and the other he named as Trombone Pampa. In 1964, another American explorer called Gene Savoy was exploring the ruins at Trombone Pampa, that Bingham has discovered. He found that Trombone Pampa was indeed Vilcabamba, thus disproving Bingham's theory that Machu Pichu was Vilcabamba.\n" +
                        "\n" +
                        "This discovery by Gene Savoy caused huge confusion among archaeologists and historians. If Machu Pichu wasn't actually Vilcabamba, then why was it built? What purpose did it serve? These were the questions that historians wanted the answers to. However, since the Incas didn't have written language, finding answers to these questions was not easy. \n" +
                        "\n" +
                        "* Why was it built?\n" +
                        "The Incas were not only ferocious warriors but also skilled engineers.  They built a vast network of roads and stone buildings without the use of wheel or iron tools. So, they should have known that the location, where Machu Picchu stands today, was prone to earthquakes and landslides. Yet, despite the amount of money, time, and labor, it would cost them, they decided to build Machu Picchu there.\n" +
                        "\n" +
                        "Therefore, there should be a strong reason for the construction of Machu Picchu. But nobody is certain what this reason is. However, by looking at the way Machu Picchu was built, historians have deduced the purpose for which Machu Picchu was constructed.\n" +
                        "\n" +
                        "Machu Pichu is a city of rock built on a mountain. But it has no walls surrounding the city. So, it couldn't have been used for defense.\n" +
                        "\n" +
                        "It has half a hectare of green vegetation watered by open waterways and fountains. Corn and potato were primarily grown here, which were the food for royal people at that time. This indicates that Machu Pichu was intended to be used by the king and his relatives.\n" +
                        "\n" +
                        "At the base of the mountain on which Machu Picchu was built, the Urubamba River flows. This river was holy to the Incas. Moreover, a pillar that stands at the highest point of Machu Pichu is aligned with the four mountain gods of great importance to the Incas. Two virtual lines, each of them connecting the peaks of two opposite mountains, would meet at this pillar. This indicates that the Incas considered Machu Picchu a holy site.\n" +
                        "\n" +
                        "It might have taken 50 years to finish this city.\n" +
                        "\n" +
                        "From all these observations, historians believe that Machu Picchu could have been built by the Inca emperor Pachakuti to serve as a royal estate. The Inca emperors could have used it a few days every year, just like a resort.";
                break;
            case 5:
                mImageResId = R.drawable.menu_chichen_itza;
                newTitle = "Chichen Itza";
                newDetail = "The sacred site Chichen Itza was one of the greatest Mayan centers in the world. Built during the sixth century A.D., it rose to prominence within hundred years and continued to thrive even after the end of the golden age of the Mayan civilization.\n" +
                        "\n" +
                        "* Why was it built?\n" +
                        "\n" +
                        "The Mayans were one of the dominant native people of Central America. Unlike other civilizations of that time, which originated around rivers and delta regions, the Mayan civilization originated in a place with very few rivers that could be used for irrigation or transport. \n" +
                        "\n" +
                        "Even though rivers are scarce, the region receives sufficient rainfall for up to six months every year. However, the limestone abundant in those areas, which exists under the thin layer of soil, absorbs rainwater immediately. \n" +
                        "\n" +
                        "But that doesn't mean that water doesn't accumulate anywhere at all. Indeed, water accumulates in several swamps that can be found in these areas. But this water is too salty to be used for drinking or irrigation. Therefore, this area was highly unsuitable for early human settlement. \n" +
                        "\n" +
                        "Yet, the earliest Mayan settlements started appearing in these areas around 1800 B.C. This proves that Mayans were intelligent people who found ways to survive in a water-scarce environment. \n" +
                        "\n" +
                        "Indeed, historians have found evidence that Mayans obtained water by using innovative methods like building small tanks to store rainwater, filtering saltwater using limestone, and finding caves that contained freshwater. Using this water, the Mayans started farming, cultivating crops like Maize to feed themselves. \n" +
                        "\n" +
                        "Between 2000B.C. and 250A.D., keeping this effective water management and agriculture at their core, Mayan cities started to emerge. These cities eventually became huge centers that attracted massive human populations. Indeed, one of these cities was so big that it had population of 250,000. \n" +
                        "\n" +
                        "However, unlike the Incas and the Aztecs, these Mayan cities never joined hands to form a Mayan empire despite having a common culture and similar languages. Instead, ruled by kings who were considered divine, these Mayan cities competed against each other. They even went to such lengths to construct huge pyramids to show off their power to other cities. \n" +
                        "\n" +
                        "Around 300A.D., the golden age of the Mayan civilization began. During their golden age, their cities started becoming more organized and powerful. The number of these cities grew to 40, with each city housing 5,000 to 50,000 people. Many of these cities had central plazas and palaces. Buildings of religious importance, like stone pyramids and temples, and buildings of cultural significance, like ballcourts, also became common in these cities. \n" +
                        "\n" +
                        "Chichen Itza is one such city that emerged during the golden age of the Mayans. Built somewhere in the sixth century A.D., it rose to prominence within a hundred years. Since the terrain here was rough, it was first leveled, and a complex network of roads and buildings were built upon it. Some of these buildings, including a ball court and a stepped pyramid, can be seen even today. \n" +
                        "\n" +
                        "Even though it led to the emergence of urban cities like Chichen Itza, the golden age of the Mayan civilization did not last very long. Between the eighth and tenth centuries, a mysterious event happened in the Mayan civilization. Nobody knows what it was. It could have been a severe drought or the unprecedented warfare between Mayan cities, or the overuse of resources. But whatever it was, it shook the Mayan civilization to the core. As a result, most of these Mayan cities were abandoned. \n" +
                        "\n" +
                        "However, very few cities, like Chichen Itza, continued to flourish even after the end of the Mayan golden era. They continued to thrive until the 16th century when the Spanish came and eventually led to the fall of the Mayan civilization. Chichen Itza, however, might have lost its significance even earlier, around the thirteenth century, as a result of the power struggle among cities. \n" +
                        "\n" +
                        "Today, Chichen Itza is a world heritage site and a world wonder. The buildings preserved at this site give us an insight into how Mayans lived 1500 years ago. Especially noteworthy among these buildings are a ballcourt and a stepped pyramid. \n" +
                        "\n" +
                        "This ballcourt is where the Mayans played their famous ball game called Ulama. In this ball game, players, up to seven on each side, used only their hips, knees, and upper arms to push 3-4 kg rubber ball past the enemy line or put it through a stone ring in the wall.\n" +
                        "\n" +
                        "This game became an indispensable part of their lives. While some games were played just for fun, some games were soaked in gambling. Houses, fields, and even children were used to gamble. Sometimes, the game was played for purely religious reasons, with the players of the losing side being sacrificed to the gods. \n" +
                        "\n" +
                        "Mayans were highly religious people. They believed that, since the gods created everything, they needed something in return. So, they often made sacrifices to repay their debt to the gods. The most common sacrifice in the Mayan civilization was one's own blood. They pierced their body part and then burned the blood as an offering to their gods.\n" +
                        "\n" +
                        "They usually never sacrificed normal humans because normal humans were deemed studied unworthy of the gods. If they sacrificed humans, it was normally the captured king or some other royalty of the enemy kingdom. Such sacrifices and other rituals were often performed on top of stepped pyramids, like the one found in Chichen Itza. Hence, these pyramids held religious importance in the Mayan culture.";
                break;
            default:
                mImageResId = R.drawable.menu_colosseum;
                newTitle = "The Colosseum";
                newDetail = "The Colosseum is a huge amphitheater that stands in the center of Rome, in Italy. When it was built, it had a seating capacity of 50,000 people. However, today, only one-third of it remains.\n" +
                        "\n" +
                        "Building an amphitheater that could host 50,000 people may not be a big deal today. But two thousand years ago, it was an extraordinary accomplishment.\n" +
                        "\n" +
                        "* Why was it built?\n" +
                        "\n" +
                        "Rome was initially kingdom that transformed into a republic. However, the Roman Republic was brought to an end when Julius Caeser became a dictator in 46 B.C. In the political turmoil that ensued, he was assassinated by rebellious senators. His adopted son Octavian, who later came to be known as Augustus, avenged Caeser's murderers and established the Roman Empire, becoming its first emperor. \n" +
                        "\n" +
                        "Even though Augustus was a righteous ruler, his successors were not. This led to turmoil in 68 A.D., and the Julio-Claudian dynasty, from which Augustus hailed, was overthrown. Eventually, Vespasian became the Roman Emperor, and he established the Flavian dynasty.  \n" +
                        "\n" +
                        "Once he became the Emperor, Vespasian ordered the construction of a huge amphitheater for the Roman people, at the same site where the previous Roman Emperor's palace stood. \n" +
                        "\n" +
                        "Unlike the other amphitheaters of that time, which were built into hillsides to provide support for the building, the Flavian Amphitheater was built as a freestanding structure. After ten years of construction, the Flavian Amphitheater was opened by his son Titus in 80 A.D. with 100 days of games. \n" +
                        "\n" +
                        "In this amphitheater, which came to be known as the Colosseum in the middle ages, 50,000 people could be seated. \n" +
                        "\n" +
                        "The men who fought in the Colosseum were mostly criminals or prisoners of war. At times, they were made to fight to the death as a means of executing them. Other times, they were bought as slaves and trained to be gladiators. \n" +
                        "\n" +
                        "Training gladiators was a costly business. So, contrary to how Hollywood often portrays gladiatorial fights, the gladiators did not always fight to the death. Most of the time, they fought until one of the gladiators was wounded or ran out of energy. Only rarely, when the owner of the gladiator was compensated heavily, did the gladiators fight to the death. \n" +
                        "\n" +
                        "Since gladiators were mostly slaves, most of them fought to win their freedom. They could win their freedom by being top-ranked gladiator for 3 to 5 years. Upon winning his freedom, the gladiator was given a wooden sword, that was the proof of his freedom as a gladiator. \n" +
                        "\n" +
                        "A gladiator could also win his freedom by portraying a performance that the Colosseum had never seen before. But it was very rare because the audience often loved the best gladiators. So, letting them go often cost the gladiator business heavily. \n" +
                        "\n" +
                        "Just like the sportsmen of our time, the victorious gladiators could become famous and earn loyal fans. So, occasionally, even free Romans who wanted fame became gladiators. \n" +
                        "\n" +
                        "Over the years, thousands of man vs. man, as well as man vs. animal fights, were held here. Roman people, who loved brutality and the sight of blood, loved these gladiatorial fights. Occasionally, mock naval battles were also hosted in the Colosseum by flooding the base with water. \n" +
                        "\n" +
                        "The Colosseum was used actively for four centuries. After the sixth century A.D., it was mostly neglected. The later generations used it as a quarry for the construction of cathedrals. Two earthquakes that struck in the years 847 and 1231 also damaged the Colosseum. As a result, by the 17th century, the Colosseum was mostly destroyed. However, by the beginning of the 18th century, several popes tried to conserve the Colosseum as a sacred Christian site. Even after all the efforts at conservation, only one-third of the original Colosseum remains today. \n" +
                        "\n" +
                        "* How long did it take?\n" +
                        "\n" +
                        "Almost 60,000 Jewish slaves worked day and night to build the Colosseum using limestone, tuff, and brick-faced concrete. It took them approximately ten years to finish the construction.";
                break;
        }
        return new Song(newTitle, newDetail, mImageResId);
    }
}
