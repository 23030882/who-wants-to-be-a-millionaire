
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionBank {

    ArrayList<Question> quiz = new ArrayList<>();
    QuestionBank (){

    }

    public void showMenu(Player player, Scanner input) {
        while (true) {
            System.out.println("\n ........ Please Choose Your Preferred Question Category.........");
            System.out.println("\n ........ 1.historicalQuestions.........");
            System.out.println("\n ........ 2.pokemonQuestions.........");
            System.out.println("\n ........ 3.musicalQuestions.........");
            System.out.println("\n ........ 4.Exit.........");
            System.out.print("Option :");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    historicalQuestions(player, input);
                    break;
                case 2:
                    pokemonQuestions(player, input);
                    break;
                case 3:
                    musicalQuestions(player, input);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("please choose an option from 1-4");
                    break;
            }

        }

    }
    public void terms_and_Conditions() {

        System.out.println("\n 👀👀👀👀👀 1. Contestants must be 18+ years old to participate. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 2. Registration is free, but contestants must answer a qualifying question. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 3. Contestants will be selected randomly for the show. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 4. Contestants must answer questions correctly to progress. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 5. Lifelines (e.g., 50/50, Phone-a-Friend) can be used once each. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 6. Contestants can walk away with winnings at any time. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 7. Incorrect answers result in elimination with reduced winnings. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 8. Contestants must adhere to show rules and host instructions. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 9. Prizes are subject to taxes and other deductions. 👀👀👀👀👀");
        System.out.println("\n 👀👀👀👀👀 10. The show reserves the right to modify rules or cancel the game. 👀👀👀👀👀");
        System.out.println("\n ........ 🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥🫥 .........");
        System.out.println("\n ........ This is a fun project for entertainment purposes only. No real prize money will be awarded  .........");

    }
    private void historicalQuestions(Player player, Scanner input){



        quiz.add(new Question(
                "What is the capital of France?",
                "A) London B) Berlin C) Paris D) Madrid E) Rome",
                3));

        quiz.add(new Question(
                "Who was the first President of the United States?",
                "A) Abraham Lincoln B) George Washington C) Thomas Jefferson D) John Adams E) James Madison",
                2));

        quiz.add(new Question(
                "In which year did World War I begin?",
                "A) 1918 B) 1939 C) 1914 D) 1945 E) 1925",
                3));

        quiz.add(new Question(
                "The Great Wall is located in which country?",
                "A) Japan B) China C) India D) Korea E) Vietnam",
                2));

        quiz.add(new Question(
                "In which year did Christopher Columbus reach the Americas?",
                "A) 1500 B) 1488 C) 1519 D) 1492 E) 1525",
                4));

        quiz.add(new Question(
                "Who was the leader of Nazi Germany during World War II?",
                "A) Adolf Hitler B) Winston Churchill C) Joseph Stalin D) Benito Mussolini E) Franklin Roosevelt",
                1));

        quiz.add(new Question(
                "Which ancient Greek city-state is known for democracy?",
                "A) Sparta B) Rome C) Athens D) Thebes E) Corinth",
                3));

        quiz.add(new Question(
                "In which year did World War II begin?",
                "A) 1939 B) 1945 C) 1941 D) 1938 E) 1937",
                1));

        quiz.add(new Question(
                "Who became South Africa's first black president in 1994?",
                "A) Desmond Tutu B) Nelson Mandela C) Thabo Mbeki D) Jacob Zuma E) Oliver Tambo",
                2));

        quiz.add(new Question(
                "Who discovered penicillin?",
                "A) Louis Pasteur B) Alexander Fleming C) Isaac Newton D) Albert Einstein E) Joseph Lister",
                2));

        quiz.add(new Question(
                "Which civilization built the pyramids of Giza?",
                "A) Persia B) Egypt C) Greece D) Rome E) Babylon",
                2));

        quiz.add(new Question(
                "In which year did the French Revolution begin?",
                "A) 1776 B) 1804 C) 1789 D) 1750 E) 1799",
                3));

        quiz.add(new Question(
                "Which empire was ruled by Suleiman the Magnificent?",
                "A) Ottoman Empire B) Roman Empire C) Mongol Empire D) Persian Empire E) Byzantine Empire",
                1));

        quiz.add(new Question(
                "In which year was the Magna Carta signed?",
                "A) 1066 B) 1492 C) 1215 D) 1314 E) 1415",
                3));

        quiz.add(new Question(
                "Who led the Soviet Union during most of World War II?",
                "A) Vladimir Lenin B) Leon Trotsky C) Nikita Khrushchev D) Joseph Stalin E) Brezhnev",
                4));

        quiz.add(new Question(
                "Which country colonized South Africa?",
                "A) Spain B) Britain C) France D) Portugal E) Netherlands",
                2));

        quiz.add(new Question(
                "Which empire built Machu Picchu?",
                "A) Aztec B) Maya C) Inca D) Olmec E) Toltec",
                3));

        quiz.add(new Question(
                "Who wrote the Communist Manifesto with Friedrich Engels?",
                "A) Mao Zedong B) Karl Marx C) Joseph Stalin D) Vladimir Lenin E) Friedrich Engels",
                2));

        quiz.add(new Question(
                "Which city was destroyed by Mount Vesuvius in AD 79?",
                "A) Athens B) Troy C) Babylon D) Pompeii E) Sparta",
                4));

        quiz.add(new Question(
                "In which year did India gain independence?",
                "A) 1945 B) 1950 C) 1947 D) 1948 E) 1960",
                3));

        quiz.add(new Question(
                "Which empire built roads across Britain?",
                "A) Roman Empire B) Greek Empire C) Persian Empire D) Mongol Empire E) Ottoman Empire",
                1));

        quiz.add(new Question(
                "Who started the Protestant Reformation?",
                "A) John Calvin B) Henry VIII C) Martin Luther D) Erasmus E) Zwingli",
                3));

        quiz.add(new Question(
                "Which famous ship sank in 1912?",
                "A) Lusitania B) Titanic C) Britannic D) Queen Mary E) Mayflower",
                2));

        quiz.add(new Question(
                "Which treaty ended World War I?",
                "A) Treaty of Paris B) Treaty of Vienna C) Treaty of Versailles D) Treaty of Tordesillas E) Treaty of Utrecht",
                3));

        quiz.add(new Question(
                "Which explorer began the first circumnavigation of the globe?",
                "A) Vasco da Gama B) Ferdinand Magellan C) James Cook D) Marco Polo E) Hernan Cortes",
                2));

        quiz.add(new Question(
                "Which organization was founded in 1945?",
                "A) NATO B) United Nations C) League of Nations D) Red Cross E) IMF",
                2));

        quiz.add(new Question(
                "Which leader founded the People's Republic of China?",
                "A) Mao Zedong B) Sun Yat-sen C) Chiang Kai-shek D) Deng Xiaoping E) Zhou Enlai",
                1));

        quiz.add(new Question(
                "Which Egyptian queen allied with Julius Caesar?",
                "A) Cleopatra B) Nefertiti C) Hatshepsut D) Isis E) Arsinoe",
                1));

        quiz.add(new Question(
                "Which civilization dominated central Mexico before Spain?",
                "A) Inca B) Aztec C) Maya D) Toltec E) Olmec",
                2));

        quiz.add(new Question(
                "Which battle ended Napoleon's rule?",
                "A) Waterloo B) Trafalgar C) Leipzig D) Austerlitz E) Borodino",
                1));

        quiz.add(new Question(
                "Who was the first emperor of unified China?",
                "A) Han Wudi B) Qin Shi Huang C) Taizong D) Kangxi E) Yongle",
                2));

        quiz.add(new Question(
                "Which dynasty rebuilt the Great Wall?",
                "A) Tang B) Song C) Ming D) Qing E) Yuan",
                3));

        quiz.add(new Question(
                "Which civilization invented cuneiform?",
                "A) Egyptians B) Sumerians C) Greeks D) Romans E) Persians",
                2));

        quiz.add(new Question(
                "Which city created Hammurabi's Code?",
                "A) Babylon B) Nineveh C) Ur D) Akkad E) Assur",
                1));

        quiz.add(new Question(
                "Napoleon's greatest victory in 1805?",
                "A) Austerlitz B) Borodino C) Trafalgar D) Leipzig E) Jena",
                1));

        quiz.add(new Question(
                "Which empire captured Constantinople in 1453?",
                "A) Byzantine Empire B) Ottoman Empire C) Roman Empire D) Persian Empire E) Abbasid Caliphate",
                2));

        quiz.add(new Question(
                "Which city fought Rome under Hannibal?",
                "A) Carthage B) Athens C) Sparta D) Alexandria E) Troy",
                1));

        quiz.add(new Question(
                "Which Japanese era began modernization in 1868?",
                "A) Tokugawa B) Meiji C) Edo D) Heian E) Kamakura",
                2));

        quiz.add(new Question(
                "Which empire used early iron weapons?",
                "A) Hittites B) Assyrians C) Babylonians D) Persians E) Phoenicians",
                1));

        quiz.add(new Question(
                "Which dynasty preceded Qin?",
                "A) Zhou B) Shang C) Qin D) Han E) Xia",
                1));

        quiz.add(new Question(
                "Who founded the Persian Empire?",
                "A) Cyrus the Great B) Darius I C) Xerxes I D) Cambyses II E) Artaxerxes I",
                1));

        quiz.add(new Question(
                "Which civilization did Sargon rule?",
                "A) Akkadians B) Sumerians C) Babylonians D) Assyrians E) Hittites",
                1));

        quiz.add(new Question(
                "Who created the Justinian Code?",
                "A) Justinian I B) Constantine XI C) Basil II D) Heraclius E) Alexios I",
                1));

        quiz.add(new Question(
                "War between Athens and Sparta?",
                "A) Peloponnesian War B) Persian Wars C) Punic Wars D) Macedonian Wars E) Corinthian War",
                1));

        quiz.add(new Question(
                "Which battle secured Alexander's conquest of Persia?",
                "A) Gaugamela B) Issus C) Granicus D) Chaeronea E) Arbela",
                1));

        quiz.add(new Question(
                "Period after Alexander's death?",
                "A) Hellenistic Age B) Classical Age C) Archaic Age D) Dark Age E) Bronze Age",
                1));

        quiz.add(new Question(
                "Islamic dynasty that built Baghdad?",
                "A) Abbasid B) Umayyad C) Fatimid D) Ottoman E) Seljuk",
                1));

        quiz.add(new Question(
                "1494 treaty dividing the New World?",
                "A) Treaty of Tordesillas B) Treaty of Zaragoza C) Treaty of Utrecht D) Treaty of Paris E) Treaty of Madrid",
                1));

        quiz.add(new Question(
                "Which dynasty invented paper money?",
                "A) Han Dynasty B) Tang Dynasty C) Song Dynasty D) Ming Dynasty E) Yuan Dynasty",
                3));

        quiz.add(new Question(
                "Which battle established Norman rule in England?",
                "A) Hastings B) Stamford Bridge C) Bannockburn D) Bosworth Field E) Agincourt",
                1));

    }
    private void pokemonQuestions(Player player, Scanner input){

            quiz.add(new Question(
                    "Which Pokémon is the primary mascot of the franchise?",
                    "A) Meowth B) Pikachu C) Clefairy D) Eevee E) Bulbasaur",
                    2));

            quiz.add(new Question(
                    "What is the first Pokémon choice given to trainers in the Kanto region?",
                    "A) Pikachu B) Pidgey C) Charmander D) Rattata E) Mew",
                    3));

            quiz.add(new Question(
                    "Which item is used to catch wild Pokémon?",
                    "A) Potion B) Poké Ball C) Revive D) Antidote E) Berry",
                    2));

            quiz.add(new Question(
                    "What type is the Pokémon Squirtle?",
                    "A) Fire B) Grass C) Water D) Electric E) Ground",
                    3));

            quiz.add(new Question(
                    "Who is the main antagonist group in the Kanto region?",
                    "A) Team Magma B) Team Galactic C) Team Rocket D) Team Plasma E) Team Flare",
                    3));

            quiz.add(new Question(
                    "What does a Pikachu evolve into when exposed to a Thunder Stone?",
                    "A) Pichu B) Jolteon C) Raichu D) Electabuzz E) Zapdos",
                    3));

            quiz.add(new Question(
                    "Which of these is NOT a Grass-type starter?",
                    "A) Bulbasaur B) Chikorita C) Treecko D) Chimchar E) Snivy",
                    4));

            quiz.add(new Question(
                    "What is the name of the device used to record Pokémon data?",
                    "A) PokéNav B) Pokédex C) PokéGear D) PokéEtch E) Rotom-Phone",
                    2));

            quiz.add(new Question(
                    "In which city does the Pokémon journey usually start in Red and Blue?",
                    "A) Viridian City B) Pewter City C) Pallet Town D) Cerulean City E) Lavender Town",
                    3));

            quiz.add(new Question(
                    "Which type is immune to Electric-type attacks?",
                    "A) Flying B) Ground C) Water D) Steel E) Rock",
                    2));


            quiz.add(new Question(
                    "Which Pokémon is known as 'The Genetic Pokémon'?",
                    "A) Mew B) Mewtwo C) Ditto D) Deoxys E) Genesect",
                    2));

            quiz.add(new Question(
                    "How many Eevee evolutions (Eeveelutions) currently exist?",
                    "A) 3 B) 5 C) 7 D) 8 E) 9",
                    4));

            quiz.add(new Question(
                    "What is the signature move of the Pokémon Magikarp?",
                    "A) Tackle B) Flail C) Splash D) Hydro Pump E) Bounce",
                    3));

            quiz.add(new Question(
                    "Which region is the setting for Pokémon Gold and Silver?",
                    "A) Kanto B) Johto C) Hoenn D) Sinnoh E) Unova",
                    2));

            quiz.add(new Question(
                    "Which type was introduced in Gen 6 to balance the Dragon type?",
                    "A) Steel B) Dark C) Fairy D) Ghost E) Poison",
                    3));

            quiz.add(new Question(
                    "Which of these is a 'Pseudo-Legendary' Pokémon?",
                    "A) Arcanine B) Dragonite C) Lucario D) Gyarados E) Flygon",
                    2));

            quiz.add(new Question(
                    "What is the name of the Pokémon Professor in the Johto region?",
                    "A) Oak B) Birch C) Elm D) Rowan E) Juniper",
                    3));

            quiz.add(new Question(
                    "Which Pokémon is famously found at the top of Mt. Silver?",
                    "A) Lance B) Blue C) Red D) Gold E) Steven",
                    3));

            quiz.add(new Question(
                    "What is the maximum number of moves a Pokémon can know at once?",
                    "A) 3 B) 4 C) 5 D) 6 E) Unlimited",
                    2));

            quiz.add(new Question(
                    "Which Pokémon is known as the 'Liar Pokémon'?",
                    "A) Meowth B) Sudowoodo C) Zoroark D) Mawile E) Liepard",
                    2));


            quiz.add(new Question(
                    "Which Fossil Pokémon is resurrected from the Old Amber?",
                    "A) Omanyte B) Kabuto C) Aerodactyl D) Lileep E) Anorith",
                    3));

            quiz.add(new Question(
                    "What is the effect of the move 'False Swipe'?",
                    "A) High critical hit ratio B) Always leaves the target with 1 HP C) Lowers defense D) Steals the opponent's item E) Always hits",
                    2));

            quiz.add(new Question(
                    "Which Pokémon was the first to ever be designed?",
                    "A) Rhydon B) Bulbasaur C) Pikachu D) Arceus E) Mew",
                    1));

            quiz.add(new Question(
                    "Which type is super effective against Psychic-type Pokémon?",
                    "A) Fighting B) Poison C) Bug D) Dragon E) Normal",
                    3));

            quiz.add(new Question(
                    "What is the name of the stone that allows Charizard to become Mega Charizard X?",
                    "A) Fire Stone B) Charizardite X C) Sun Stone D) Dragon Stone E) Mega Ember",
                    2));

            quiz.add(new Question(
                    "Which legendary bird is associated with the element of Ice?",
                    "A) Moltres B) Zapdos C) Articuno D) Lugia E) Ho-Oh",
                    3));

            quiz.add(new Question(
                    "Which Pokémon is the mascot of Pokémon Silver?",
                    "A) Ho-Oh B) Entei C) Lugia D) Celebi E) Suicune",
                    3));

            quiz.add(new Question(
                    "What happens when you use a Water Stone on a Shellder?",
                    "A) Evolves into Cloyster B) Evolves into Dewgong C) Evolves into Starmie D) Nothing E) It gains a level",
                    1));

            quiz.add(new Question(
                    "What was the first Dark/Ghost type Pokémon with no weaknesses (pre-Gen 6)?",
                    "A) Spiritomb B) Sableye C) Gengar D) Umbreon E) Misdreavus",
                    2));

            quiz.add(new Question(
                    "Which of these Pokémon does NOT evolve?",
                    "A) Onix B) Scyther C) Lapras D) Chansey E) Porygon",
                    3));


            quiz.add(new Question(
                    "What is the signature ability of the Pokémon Shedinja?",
                    "A) Levitate B) Sturdy C) Wonder Guard D) Magic Guard E) Intimidate",
                    3));

            quiz.add(new Question(
                    "Which Pokémon is known as the 'Alpha Pokémon'?",
                    "A) Dialga B) Palkia C) Arceus D) Rayquaza E) Giratina",
                    3));

            quiz.add(new Question(
                    "What is the base power of the move 'Explosion' in Gen 5 and later?",
                    "A) 150 B) 200 C) 250 D) 300 E) 500",
                    3));

            quiz.add(new Question(
                    "Which Pokémon has the most possible forms for its Spinda patterns?",
                    "A) 1,000 B) Over 4 Billion C) 151 D) 65,536 E) 1 Million",
                    2));

            quiz.add(new Question(
                    "In the original games, which type was erroneously immune to Ghost moves?",
                    "A) Normal B) Psychic C) Fighting D) Poison E) Dragon",
                    2));

            quiz.add(new Question(
                    "Which city in Johto is home to the Kimono Girls?",
                    "A) Goldenrod City B) Ecruteak City C) Olivine City D) Blackthorn City E) Azalea Town",
                    2));

            quiz.add(new Question(
                    "Which of these moves has a priority of +1?",
                    "A) Protect B) Quick Attack C) Extreme Speed D) Fake Out E) Roar",
                    2));

            quiz.add(new Question(
                    "What held item increases the power of Water-type moves by 20%?",
                    "A) Mystic Water B) Charcoal C) Silk Scarf D) Black Belt E) Soft Sand",
                    1));

            quiz.add(new Question(
                    "Which Pokémon is found inside the 'Odd Keystone'?",
                    "A) Rotom B) Spiritomb C) Gastly D) Darkrai E) Cofagrigus",
                    2));

            quiz.add(new Question(
                    "Which town's background music was rumored to cause the 'Lavender Town Syndrome'?",
                    "A) Pallet Town B) Lavender Town C) Cinnabar Island D) Saffron City E) Fuchsia City",
                    2));


            quiz.add(new Question(
                    "Which Pokémon has the lowest base stat total of all Pokémon?",
                    "A) Magikarp B) Sunkern C) Wishiwashi (Solo) D) Blipbug E) Feebas",
                    2));

            quiz.add(new Question(
                    "What is the only Pokémon that can learn the move 'Sketch'?",
                    "A) Ditto B) Smeargle C) Mew D) Chatot E) Mimikyu",
                    2));

            quiz.add(new Question(
                    "Which status condition halves a Pokémon's Attack stat?",
                    "A) Paralysis B) Poison C) Burn D) Sleep E) Confusion",
                    3));

            quiz.add(new Question(
                    "How many steps does it take for a Magikarp egg to hatch?",
                    "A) 1,280 B) 2,560 C) 3,840 D) 5,120 E) 10,240",
                    1));

            quiz.add(new Question(
                    "What is the name of the hidden stat that determines a Pokémon's growth and power variation?",
                    "A) EV B) IV C) AV D) DV E) CP",
                    2));

            quiz.add(new Question(
                    "In Pokémon Red/Blue, what is the internal index number of Mew?",
                    "A) 1 B) 151 C) 21 D) 150 E) 0",
                    3));

            quiz.add(new Question(
                    "Which Pokémon's name is an anagram of 'Kobra'?",
                    "A) Ekans B) Arbok C) Seviper D) Dragalge E) Serperior",
                    2));

            quiz.add(new Question(
                    "What is the catch rate of a standard Beldum?",
                    "A) 3 B) 45 C) 190 D) 255 E) 120",
                    1));

            quiz.add(new Question(
                    "Which weather condition boosts the Special Defense of Rock-types by 50%?",
                    "A) Rain B) Sunny Day C) Sandstorm D) Hail E) Fog",
                    3));

            quiz.add(new Question(
                    "Who was the Director of the original Pokémon Red and Green games?",
                    "A) Shigeru Miyamoto B) Satoshi Tajiri C) Junichi Masuda D) Ken Sugimori E) Hideo Kojima",
                    2));

    }

    private void musicalQuestions(Player player, Scanner input){


        quiz.add(new Question("Who is known as the 'King of Pop'?",
                "A) Elvis Presley B) Prince C) Michael Jackson D) Justin Timberlake E) Bruno Mars",
                3));

        quiz.add(new Question("How many strings does a standard guitar have?",
                "A) 4 B) 5 C) 6 D) 7 E) 12",
                3));

        quiz.add(new Question("Which band was John Lennon a member of?",
                "A) The Rolling Stones B) The Beatles C) The Who D) Queen E) Led Zeppelin",
                2));

        quiz.add(new Question("What is the highest female singing voice?",
                "A) Alto B) Mezzo-Soprano C) Soprano D) Tenor E) Contralto",
                3));

        quiz.add(new Question("Which instrument do you play using 'reeds'?",
                "A) Trumpet B) Violin C) Clarinet D) Piano E) Drums",
                3));

        quiz.add(new Question("Which singer is known for the hit 'Shake It Off'?",
                "A) Katy Perry B) Adele C) Taylor Swift D) Rihanna E) Beyoncé",
                3));
        quiz.add(new Question("What does 'Piano' mean in musical terminology?",
                "A) Loud B) Fast C) Soft D) Slow E) Smooth",
                3));

        quiz.add(new Question("Who performed 'Purple Rain'?",
                "A) David Bowie B) Prince C) Jimi Hendrix D) Mick Jagger E) Elton John",
                2));

        quiz.add(new Question("Which city is considered the birthplace of Jazz?",
                "A) New York B) Chicago C) New Orleans D) Nashville E) Detroit",
                3));

        quiz.add(new Question("What is the name of the group that sang 'Dancing Queen'?",
                "A) Bee Gees B) ABBA C) Fleetwood Mac D) Boney M E) Earth, Wind & Fire",
                2));


        quiz.add(new Question("Which album is the best-selling of all time?",
                "A) Back in Black B) Dark Side of the Moon C) Thriller D) Rumours E) The Bodyguard",
                3));

        quiz.add(new Question("Who composed 'The Four Seasons'?",
                "A) Bach B) Beethoven C) Vivaldi D) Mozart E) Handel",
                3));

        quiz.add(new Question("Which member of Queen was the lead singer?",
                "A) Brian May B) Roger Taylor C) Freddie Mercury D) John Deacon E) Adam Lambert",
                3));

        quiz.add(new Question("What genre is characterized by 'skank' guitar rhythms?",
                "A) Blues B) Reggae C) Heavy Metal D) Country E) Disco",
                2));

        quiz.add(new Question("Which musical features the song 'Defying Gravity'?",
                "A) Hamilton B) Cats C) Wicked D) Les Misérables E) Phantom of the Opera",
                3));

        quiz.add(new Question("In what decade did Elvis Presley first rise to fame?",
                "A) 1940s B) 1950s C) 1960s D) 1970s E) 1930s",
                2));

        quiz.add(new Question("Who wrote the opera 'The Magic Flute'?",
                "A) Wagner B) Puccini C) Mozart D) Verdi E) Rossini",
                3));

        quiz.add(new Question("What is the name of the 'fifth' Beatle (their manager)?",
                "A) George Martin B) Brian Epstein C) Pete Best D) Billy Preston E) Yoko Ono",
                2));

        quiz.add(new Question("Which woodwind instrument is the lowest in pitch?",
                "A) Oboe B) Flute C) Bassoon D) Piccolo E) English Horn",
                3));

        quiz.add(new Question("Who is the 'Queen of Soul'?",
                "A) Diana Ross B) Whitney Houston C) Aretha Franklin D) Etta James E) Tina Turner",
                3));


        quiz.add(new Question("How many symphonies did Beethoven complete?",
                "A) 5 B) 7 C) 9 D) 10 E) 41",
                3));

        quiz.add(new Question("What is the interval between C and G?",
                "A) Perfect Fourth B) Major Third C) Perfect Fifth D) Minor Sixth E) Octave",
                3));

        quiz.add(new Question("Which composer went deaf later in life?",
                "A) Chopin B) Brahms C) Beethoven D) Schubert E) Liszt",
                3));

        quiz.add(new Question("What do you call a five-note scale?",
                "A) Diatonic B) Chromatic C) Pentatonic D) Whole-tone E) Mixolydian",
                3));

        quiz.add(new Question("Who wrote the 'Moonlight Sonata'?",
                "A) Mozart B) Debussy C) Beethoven D) Rachmaninoff E) Tchaikovsky",
                3));

        quiz.add(new Question("Which instrument is sometimes called the 'king of instruments'?",
                "A) Piano B) Pipe Organ C) Violin D) Cello E) Harp",
                2));

        quiz.add(new Question("What is the time signature for a Waltz?",
                "A) 4/4 B) 2/4 C) 3/4 D) 6/8 E) 5/4",
                3));

        quiz.add(new Question("Who composed 'The Rite of Spring'?",
                "A) Stravinsky B) Shostakovich C) Prokofiev D) Rimsky-Korsakov E) Gershwin",
                1));

        quiz.add(new Question("Which era of music came directly after the Baroque era?",
                "A) Renaissance B) Romantic C) Classical D) Modern E) Medieval",
                3));

        quiz.add(new Question("What is the term for 'gradually getting louder'?",
                "A) Diminuendo B) Ritardando C) Crescendo D) Accelerando E) Legato",
                3));


        quiz.add(new Question("Which violin virtuoso was rumored to have sold his soul to the devil?",
                "A) Vivaldi B) Paganini C) Stradivari D) Corelli E) Tartini",
                2));

        quiz.add(new Question("What is the term for a male singer who sings in the alto range?",
                "A) Baritone B) Countertenor C) Castrato D) Falsetto E) Lyric Tenor",
                2));

        quiz.add(new Question("Which composer wrote 'The Well-Tempered Clavier'?",
                "A) Handel B) Bach C) Haydn D) Telemann E) Scarlatti",
                2));

        quiz.add(new Question("The 'Tristan chord' is famous in which composer's work?",
                "A) Mahler B) Wagner C) Bruckner D) Strauss E) Berg",
                2));

        quiz.add(new Question("Which instrument uses a 'mute' called a Plunger?",
                "A) Violin B) Trumpet C) Flute D) Snare Drum E) Oboe",
                2));

        quiz.add(new Question("Who developed the 12-tone technique (Serialism)?",
                "A) Schoenberg B) Webern C) Berg D) Bartók E) Hindemith",
                1));

        quiz.add(new Question("What is the lowest note on a standard 88-key piano?",
                "A) C0 B) A0 C) E1 D) G0 E) A1",
                2));

        quiz.add(new Question("Which opera is based on the story of 'Madame Butterfly'?",
                "A) Turandot B) Madama Butterfly C) La Traviata D) Carmen E) Tosca",
                2));

        quiz.add(new Question("What wood is traditionally used for the body of a high-end violin?",
                "A) Oak B) Maple C) Pine D) Mahogany E) Cedar",
                2));

        quiz.add(new Question("Which artist holds the record for most Grammy wins?",
                "A) Georg Solti B) Quincy Jones C) Beyoncé D) Alison Krauss E) Stevie Wonder",
                3));

        // --- MILLIONAIRE: Master Tier ---
        quiz.add(new Question("What is the frequency of 'Concert A' in Hertz?",
                "A) 432 Hz B) 440 Hz C) 444 Hz D) 435 Hz E) 448 Hz",
                2));
        quiz.add(new Question("Who wrote the 'Enigma Variations'?",
                "A) Vaughan Williams B) Edward Elgar C) Benjamin Britten D) Gustav Holst E) William Walton",
                2));
        quiz.add(new Question("Which scale contains no half-steps?",
                "A) Major B) Minor C) Whole-tone D) Dorian E) Lydian",
                3));

        quiz.add(new Question("How many valves does a standard Tuba have?",
                "A) 2 B) 3 to 6 C) 1 D) None E) 8",
                2));

        quiz.add(new Question("Who is the composer of the 'Gymnopédies'?",
                "A) Ravel B) Satie C) Debussy D) Fauré E) Saint-Saëns",
                2));

        quiz.add(new Question("The 'Devil's Trill' sonata was written by whom?",
                "A) Paganini B) Tartini C) Vitali D) Veracini E) Locatelli",
                2));

        quiz.add(new Question("What is the Italian term for 'very fast'?",
                "A) Allegro B) Vivace C) Presto D) Prestissimo E) Accelerando",
                4));

        quiz.add(new Question("Which symphony is known as the 'Tragic'?",
                "A) Mahler 6th B) Schubert 4th C) Tchaikovsky 6th D) Beethoven 3rd E) Brahms 1st",
                1));

        quiz.add(new Question("What year did MTV first launch?",
                "A) 1979 B) 1980 C) 1981 D) 1982 E) 1983",
                3));

        quiz.add(new Question("Which composer was also a professional chemist?",
                "A) Borodin B) Cui C) Mussorgsky D) Balakirev E) Rimsky-Korsakov",
                1));

    }
    public Question QuestionServer(int currentLevel){
            return quiz.get(currentLevel);


            }
    public int getCorrectAnswerIndex(){
        return getCorrectAnswerIndex();
    }
        }



