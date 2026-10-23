package com.example.data

data class FundamentalTopic(
    val id: String,
    val title: String,
    val hindiTitle: String,
    val summary: String,
    val hindiSummary: String,
    val contentSections: List<ContentSection>
)

data class ContentSection(
    val heading: String,
    val hindiHeading: String,
    val body: String,
    val hindiBody: String,
    val keyPoints: List<String>,
    val hindiKeyPoints: List<String>
)

object FundamentalsData {
    val topics: List<FundamentalTopic> = listOf(
        // Topic 1: What is Hydroponics & How it Works
        FundamentalTopic(
            id = "what_is_hydroponics",
            title = "What is Hydroponics & How It Works?",
            hindiTitle = "হাইড্ৰ'পনিক্স কি আৰু ই কেনেকৈ কাম কৰে?",
            summary = "Hydroponics is the science of growing plants in an inert medium or water solution without soil, delivering mineral ions directly to roots with maximum dissolved oxygen.",
            hindiSummary = "হাইড্ৰ'পনিক্স হৈছে কোনো মাটি নোহোৱাকৈ কেৱল খনিজ পুষ্টি মিশ্ৰিত পানী আৰু অক্সিজেনৰ সহায়ত উদ্ভিদ আৰু শাক-পাচলি খেতি কৰাৰ এক আধুনিক আৰু লাভজনক বৈজ্ঞানিক পদ্ধতি।",
            contentSections = listOf(
                ContentSection(
                    heading = "1. Why Soil is NOT Mandatory for Plants",
                    hindiHeading = "১. গছৰ বৃদ্ধিৰ বাবে মাটি কিয় অপৰিহাৰ্য নহয়?",
                    body = "Plants do NOT 'eat' soil. In traditional farming, soil merely acts as an anchor for roots and a storehouse holding mineral salts. When you water soil, water dissolves these minerals into ionic form (NO3-, H2PO4-, K+, Ca2+, Mg2+), which roots then absorb. In Hydroponics, we dissolve these pure mineral ions directly into water and deliver them directly to root hairs. Plants don't waste energy pushing thick roots through compacted dirt looking for food; all energy goes into rapid leaf and fruit production!",
                    hindiBody = "উদ্ভিদে কেতিয়াও প্ৰকৃততে মাটি 'নাখায়'। মাটিৰ মূল কাম হৈছে গছৰ শিপাডালক খামোচ মাৰি থিয় কৰি ৰখা আৰু খনিজ লৱণ ধৰি ৰখা। মাটিত পানী দিলে সেই পানীয়ে নাইট্ৰেট, ফছফৰাছ, পটাছিয়াম, কেলচিয়াম আদি খনিজ আয়ন আকাৰত শিপাক দিয়ে। হাইড্ৰ'পনিক্সত আমি এই বিশুদ্ধ খনিজ পুষ্টিবোৰ পোনপটীয়াকৈ পানীত দ্ৰৱীভূত কৰি শিপাৰ গুৰিত যোগান ধৰোঁ। উদ্ভিদে মাটিৰ মাজেৰে খাদ্য বিচাৰি অনাহকত শক্তি অপচয় নকৰে, যাৰ ফলত গছবোৰ মাটিতকৈ ৪০-৫০% দ্ৰুতভাৱে বাঢ়ে আৰু বম্পাৰ ফচল দিয়ে!",
                    keyPoints = listOf(
                        "90% Less Water: Water is recirculated and recycled; only plant transpiration uses water.",
                        "30% to 50% Faster Growth: Roots have constant access to water, oxygen, and nutrients simultaneously.",
                        "Zero Soil Pests & Weeds: No soil nematodes, no weeding labor, no soil-borne fungal wilts.",
                        "Vertical Stacking: Grow 3 to 5 times more food on the same square foot footprint."
                    ),
                    hindiKeyPoints = listOf(
                        "৯০% পানীৰ সঞ্চয়: পানী পুনঃপুনঃ ব্যৱহাৰ হয়, কেৱল উদ্ভিদে খোৱা পানীখিনিহে খৰচ হয়।",
                        "৪০-৫০% দ্ৰুত বৃদ্ধি: শিপাই ২৪ ঘণ্টাই অবিৰতভাৱে খাদ্য, পানী আৰু অক্সিজেন পায়।",
                        "অপতৃণ (ঘাঁহ) আৰু মাটিৰ পোকমুক্ত: মাটিত থকা কৃমি বা শিপা পচা ভেঁকুৰৰ পৰা ১০০% মুক্তি।",
                        "উলম্ব খেতি (Vertical Farming): ঘৰৰ চাল বা চোতালত একে ঠাইতে ৩ ৰ পৰা ৫ গুণ বেছি উৎপাদন।"
                    )
                ),
                ContentSection(
                    heading = "2. How Plant Roots Drink: Dissolved Oxygen (DO)",
                    hindiHeading = "২. শিপাই কেনেকৈ উশাহ লয়: পানীত দ্রবীভূত অক্সিজেন (DO)",
                    body = "Many beginners believe putting roots in water causes them to drown. Roots drown only when water LACKS Dissolved Oxygen! In hydroponics, we supercharge the nutrient water with air pumps and cascading channels to keep Dissolved Oxygen above 6-8 ppm (mg/L). With rich oxygen, roots absorb nutrients aggressively and remain glowing pearly-white without rotting.",
                    hindiBody = "বহুতে ভাবে যে পানীত শিপা ডুবাই থ'লে শিপা পচি যাব। কিন্তু শিপা পানীত ডুব যোৱাৰ বাবে নপচে, পানীত অক্সিজেনৰ অভাৱ হ'লেহে পচে! হাইড্ৰ'পনিক্সত আমি এয়াৰ পাম্প বা পানীৰ প্ৰবাহৰ দ্বাৰা পানীত অক্সিজেনৰ মাত্ৰা ৬ ৰ পৰা ৮ ppm তকৈ বেছি ৰাখোঁ। প্ৰচুৰ অক্সিজেন পালে শিপাবোৰ গাখীৰৰ দৰে বগা, উজ্জ্বল আৰু সুস্থ হৈ থাকে আৰু অতি দ্ৰুতগতিত পুষ্টি গ্ৰহণ কৰে।",
                    keyPoints = listOf(
                        "Dissolved Oxygen must be maintained above 5 mg/L (optimal 7-9 mg/L).",
                        "Water temperature strongly dictates DO: Warm water holds far less oxygen than cool water.",
                        "Optimal water temperature is 18°C to 22°C. Water > 24°C risks Pythium root rot."
                    ),
                    hindiKeyPoints = listOf(
                        "পানীত দ্রবীভূত অক্সিজেনৰ মাত্ৰা ৬-৮ ppm ৰ ওপৰত ৰাখিব লাগে।",
                        "পানীৰ উষ্ণতা যিমানে বাঢ়ে, অক্সিজেন সিমানে হ্ৰাস পায়; সেয়েহে টেংকৰ পানী ১৮°C ৰ পৰা ২২°C ৰ ভিতৰত ৰখা ভাল।",
                        "২৪°C তকৈ বেছি গৰম পানীত শিপা পচা (Pythium Root Rot) বেমাৰ হ'ব পাৰে।"
                    )
                )
            )
        ),

        // Topic 2: Water Chemistry (pH, EC, TDS, PPM)
        FundamentalTopic(
            id = "water_chemistry",
            title = "Water Chemistry: pH, EC & PPM Explained",
            hindiTitle = "পানীৰ বিজ্ঞান: pH, EC আৰু PPM ৰ সম্পূৰ্ণ জ্ঞান",
            summary = "The pulse and vital signs of hydroponics. Mastering pH (acidity) and EC (electrical conductivity) is 90% of hydroponic farming success.",
            hindiSummary = "হাইড্ৰ'পনিক্সত ৯০% সফলতা নিৰ্ভৰ কৰে পানীৰ pH (অম্লতা বা ক্ষাৰকীয়তা) আৰু EC (সাৰৰ গাঢ়তা) সঠিক মাত্ৰাত নিয়ন্ত্ৰণ কৰাৰ ওপৰত।",
            contentSections = listOf(
                ContentSection(
                    heading = "1. What is pH & Why 5.5 - 6.5 is the Magic Window?",
                    hindiHeading = "১. pH কি আৰু ৫.৫ ৰ পৰা ৬.৫ কিয় সঠিক পৰিসৰ?",
                    body = "pH measures how acidic or alkaline the water is on a scale of 0 to 14. In soil, natural microbes buffer pH. In hydroponics, YOU control the pH. If pH drifts below 5.5, Calcium and Magnesium get locked out and cannot enter root cells. If pH drifts above 6.5, Iron (Fe), Phosphorus (P), and Manganese (Mn) precipitate into insoluble crystals that roots cannot absorb (causing yellow leaves). The universal hydroponic sweet spot is 5.8 to 6.2.",
                    hindiBody = "pH য়ে পানী টেঙা (অম্লীয়) নে খাৰুৱা (ক্ষাৰকীয়) তাৰ মাত্ৰা ০ ৰ পৰা ১৪ লৈ জুখে। হাইড্ৰ'পনিক্সত ৫.৫ ৰ পৰা ৬.৫ ক সোণালী পৰিসৰ বোলা হয়। যদি pH ৫.৫ ৰ তললৈ নামি যায়, তেন্তে কেলচিয়াম আৰু মেগনেছিয়াম লক হৈ যায় আৰু শিপাই ল'ব নোৱাৰে। আনহাতে যদি pH ৬.৫ ৰ ওপৰলৈ উঠে, তেন্তে আইৰণ (লো) আৰু ফছফৰাছ স্ফটিক হৈ তলত বহে আৰু পাতবোৰ হালধীয়া পৰে। সদায় pH ৫.৮ ৰ পৰা ৬.২ ত ৰখাটো উত্তম।",
                    keyPoints = listOf(
                        "pH UP: Use dilute Potassium Hydroxide (KOH) to raise low pH.",
                        "pH DOWN: Use Food-grade Phosphoric Acid (H3PO4) 10-20% to lower high pH.",
                        "SAFETY RULE: Always add ACID TO WATER, NEVER water into acid!",
                        "Test pH daily using a calibrated digital pH pen or indicator drops."
                    ),
                    hindiKeyPoints = listOf(
                        "pH কমি গ'লে (অধিক অম্লীয়): pH UP (পটাছিয়াম হাইড্ৰক্সাইড KOH) কেইটোপালমান মিহলাওক।",
                        "pH বাঢ়ি গ'লে (অধিক খাৰুৱা): pH DOWN (ফছফৰিক এচিড) কেইটোপালমান দি ৫.৮-৬.০ লৈ আনক।",
                        "সাৱধানতা: সদায় এচিডটোপাল পানীতহে দিব, কেতিয়াও এচিডৰ ওপৰত পানী নঢালিব!",
                        "প্ৰতিদিনে পুৱা ডিজিটেল pH মিটাৰেৰে টেংকৰ পানী পৰীক্ষা কৰক।"
                    )
                ),
                ContentSection(
                    heading = "2. What is EC (Electrical Conductivity) & PPM (TDS)?",
                    hindiHeading = "২. EC আৰু PPM (TDS) কি আৰু ইয়াৰ মাপ?",
                    body = "Pure distilled RO water does NOT conduct electricity. When you dissolve mineral fertilizer salts, they break into charged ions (+ and -) which conduct electrical current. An EC meter measures this conductivity in milliSiemens per centimeter (mS/cm). EC tells you the EXACT STRENGTH of nutrients in your water. TDS (Total Dissolved Solids) in PPM is simply EC multiplied by a conversion factor (usually 500 or 700).",
                    hindiBody = "বিশুদ্ধ RO বা পাতন পানীত বিদ্যুৎ প্ৰবাহিত নহয়। যেতিয়া আমি পানীত খনিজ সাৰ মিহলাওঁ, পানীখিনিয়ে বিদ্যুৎ পৰিবহন কৰিবলৈ লয়। ডিজিটেল EC মিটাৰে এই বিদ্যুৎ প্ৰবাহক মিলিছিমেনছ (mS/cm) এককত জুখি দিয়ে। EC য়ে কয় যে পানীত সাৰ কিমান পাতলীয়া বা কিমান টান আছে। PPM (TDS) হৈছে এই EC ক ৫০০ বা ৭০০ ৰে পূৰণ কৰি পোৱা সংখ্যা।",
                    keyPoints = listOf(
                        "Starting Water (RO Water): EC should be < 0.2 mS/cm (TDS < 100 ppm).",
                        "Leafy Greens Target: EC 1.0 - 1.4 mS/cm (500 - 700 PPM).",
                        "Fruiting Crops Vegetative: EC 1.8 - 2.2 mS/cm (900 - 1100 PPM).",
                        "Fruiting Crops Production: EC 2.4 - 3.2 mS/cm (1200 - 1600 PPM).",
                        "Rule of Thumb: If EC is rising daily, plants are drinking more water than food (dilute with fresh water). If EC is falling, plants are hungry (add nutrient)."
                    ),
                    hindiKeyPoints = listOf(
                        "প্ৰাৰম্ভিক কেঁচা পানী: EC ০.২ তকৈ কম (TDS ১০০ তকৈ কম) হ'ব লাগে।",
                        "শাক-পাচলি (লেটুচ, লাই, পালেং): EC ১.০ ৰ পৰা ১.৪ (৫০০ - ৭০০ PPM)।",
                        "ফলজাতীয় শস্য বৃদ্ধিৰ সময়ত: EC ১.৮ ৰ পৰা ২.২ (৯০০ - ১১০০ PPM)।",
                        "ফলজাতীয় শস্য ফুল আৰু ফল লগাৰ সময়ত: EC ২.৪ ৰ পৰা ৩.২ (১২০০ - ১৬০০ PPM)।",
                        "সুবৰ্ণ নিয়ম: যদি দৈনিক EC বাঢ়ে, অৰ্থাৎ গছে সাৰতকৈ পানী বেছি খাইছে (সাধাৰণ পানী যোগ কৰক)। যদি EC কমে, গছৰ ভোক লাগিছে (সাৰ যোগ কৰক)।"
                    )
                )
            )
        ),

        // Topic 3: 3-Part Nutrient Formulation
        FundamentalTopic(
            id = "nutrient_formulation",
            title = "Hydroponic Nutrients: 3-Part Formula Chemistry",
            hindiTitle = "হাইড্ৰ'পনিক সাৰ: ৩-অংশীয় বিশ্বমান ফৰ্মুলা আৰু প্ৰস্তুত প্ৰণালী",
            summary = "Why you cannot use soil fertilizer (Urea/DAP) in hydroponics, and how the world-standard 3-Part formula (Masterblend + Calcium Nitrate + Epsom Salt) works.",
            hindiSummary = "সাধাৰণ ইউৰিয়া বা ডিএপি হাইড্ৰ'পনিক্সত কিয় নচলে, আৰু বিশ্ববিখ্যাত ৩-অংশীয় ফৰ্মুলা (কেলচিয়াম নাইট্ৰেট + মাষ্টাৰব্লেন্ড + এপচম ছল্ট) কেনেকৈ প্ৰস্তুত কৰিব।",
            contentSections = listOf(
                ContentSection(
                    heading = "1. Why Soil Fertilizers (Urea, DAP) Fail in Hydroponics",
                    hindiHeading = "১. মাটিৰ সাধাৰণ সাৰ (ইউৰিয়া, DAP) হাইড্ৰ'পনিক্সত কিয় ব্যৱহাৰ কৰিব নোৱাৰি?",
                    body = "Soil fertilizers like Urea (46% N) rely on soil bacteria to convert amide nitrogen into ammonium and then nitrate. In hydroponics, there is no soil bacteria bed! Urea stays in water, rots, turns foul, and suffocates roots. Hydroponics demands 100% water-soluble mineral ionic salts: Nitrate Nitrogen (NO3-), Chelated Iron (Fe-DTPA / Fe-EDDHA), and Monopotassium Phosphate.",
                    hindiBody = "ইউৰিয়াক উদ্ভিদে খাব পৰা ৰূপলৈ আনিবলৈ মাটিত থকা বেক্টেৰিয়াৰ প্ৰয়োজন। হাইড্ৰ'পনিক্সত মাটিৰ বেক্টেৰিয়া নাথাকে, যাৰ ফলত ইউৰিয়া পানীত পচি দুৰ্গন্ধ ওলায় আৰু শিপা নষ্ট কৰি পেলায়। সেয়েহে হাইড্ৰ'পনিক্সত কেৱল ১০০% পানীত সম্পূৰ্ণ দ্ৰৱণীয় হাইড্ৰ'পনিক গ্ৰেডৰ খনিজ পুষ্টি (নাইট্ৰেট নাইট্ৰ'জেন আৰু কিলেটেড অণুপুষ্টি) হে ব্যৱহাৰ কৰা হয়।",
                    keyPoints = listOf(
                        "Never use standard agricultural Urea, DAP, or compost tea in closed recirculating hydroponics.",
                        "Always use specialized 100% water-soluble hydroponic grade fertilizers with chelated trace elements."
                    ),
                    hindiKeyPoints = listOf(
                        "পাইপ আৰু ডাচ বাকেটত কেতিয়াও সাধাৰণ ইউৰিয়া, DAP বা কেঁচাসুৰা সাৰ নিদিব।",
                        "সদায় ১০০% পানীত মিহলি হোৱা বিশুদ্ধ হাইড্ৰ'পনিক গ্ৰেড সাৰ ব্যৱহাৰ কৰক।"
                    )
                ),
                ContentSection(
                    heading = "2. The Golden 3-Part Formula Recipe (Per 100 Liters)",
                    hindiHeading = "২. ১০০ লিটাৰ পানীৰ বাবে ৩-অংশীয় সাৰৰ পৰিমাণ",
                    body = "The most proven, cost-effective worldwide hydroponic nutrient recipe uses 3 raw salts:\n• Part B (Masterblend / Hydro NPK 4-18-38 or 5-11-26): 60 to 70 grams\n• Part C (Magnesium Sulfate / Epsom Salt MgSO4·7H2O): 30 to 35 grams\n• Part A (Calcium Nitrate 15.5-0-0 + 19% Ca): 60 to 70 grams\n• Plus Chelated Iron (Fe-DTPA 11%): 2 to 3 grams.",
                    hindiBody = "বিশ্বৰ সকলোতকৈ নিৰ্ভৰযোগ্য ৩-অংশীয় হাইড্ৰ'পনিক ফৰ্মুলা (১০০ লিটাৰ পানীৰ বাবে):\n• Part B (মাষ্টাৰব্লেন্ড / হাইড্ৰ' NPK 4-18-38): ৬০ ৰ পৰা ৭০ গ্ৰাম\n• Part C (এপচম ছল্ট / মেগনেছিয়াম ছালফেট MgSO4): ৩০ ৰ পৰা ৩৫ গ্ৰাম\n• Part A (কেলচিয়াম নাইট্ৰেট 15.5-0-0 + 19% Ca): ৬০ ৰ পৰা ৭০ গ্ৰাম\n• কিলেটেড আইৰণ (Fe-DTPA): ২ ৰ পৰা ৩ গ্ৰাম।",
                    keyPoints = listOf(
                        "RULE #1: NEVER mix Part A (Calcium Nitrate) and Part B/C (Phosphorus & Sulfate) together in concentrated form! If mixed concentrated, Calcium reacts with Sulfate to form Calcium Sulfate (Gypsum plaster) which precipitates out as insoluble white rock sludge and locks out both nutrients forever.",
                        "MIXING ORDER: Dissolve Part B in 100L water completely. Then dissolve Part C. Add Part A ONLY AFTER the first two are fully dissolved in the diluted tank.",
                        "Stir continuously with a circulation pump."
                    ),
                    hindiKeyPoints = listOf(
                        "সুবৰ্ণ নিয়ম: কেতিয়াও Part A (কেলচিয়াম নাইট্ৰেট) আৰু Part B বা C ক গাঢ় ৰূপত একেলগে নিমিহলাব! তেনে কৰিলে কেলচিয়াম আৰু ছালফেটে বিক্ৰিয়া কৰি জিপচাম (বগা চুণৰ পাথৰ) হৈ তলত বহে আৰু সাৰখিনি চিৰদিনলৈ নষ্ট হৈ যায়।",
                        "মিহলোৱাৰ সঠিক ক্ৰম: প্ৰথমে ১০০ লিটাৰ পানীত Part B সম্পূৰ্ণ মিহলাওক। তাৰ পিছত Part C দিয়ক। শেষত দুয়োটা দ্ৰৱীভূত হোৱাৰ পাছতহে Part A ঢালিব।",
                        "পানীখিনি মটৰ বা লাঠিৰে ভালদৰে লৰাই দিব।"
                    )
                )
            )
        ),

        // Topic 4: Assam Specific Climate, Water & Bamboo Engineering
        FundamentalTopic(
            id = "assam_farming_context",
            title = "Assam Hydroponics Context: Climate, Rain, Iron & Bamboo Setup",
            hindiTitle = "অসমৰ জলবায়ু, পানীৰ আইৰণ পৰিশোধন আৰু বাঁহৰ ব্যৱস্থাপনা",
            summary = "Crucial adaptation rules for Assam: managing heavy monsoon rain, filtering high iron in groundwater, and building low-cost frames using indigenous Assam bamboo.",
            hindiSummary = "অসমৰ প্ৰচুৰ বাৰিষা, টিউবৱেলৰ পানীৰ আইৰণ ফিল্টাৰ কৰা আৰু থলুৱা জাতি বাঁহেৰে ৬০% কম খৰচত হাইড্ৰ'পনিক্স স্থাপনৰ সম্পূৰ্ণ কৌশল।",
            contentSections = listOf(
                ContentSection(
                    heading = "1. Heavy Monsoon & Rain Protection (UV Polyhouse)",
                    hindiHeading = "১. অসমৰ প্ৰচুৰ বাৰিষা আৰু বৰষুণৰ পৰা সুৰক্ষা",
                    body = "Assam receives 2000-3000 mm of rainfall during the May-September monsoon. Open-sky hydroponics will fail because rainwater dilutes and overflows reservoirs, instantly crashing EC and pH. In Assam, always construct an overhead rain shelter using 200-micron UV-stabilized clear polyfilm. Ensure the sides have 40-mesh insect netting for maximum cross-ventilation against high humidity (80-95%).",
                    hindiBody = "অসমত মে'ৰ পৰা ছেপ্টেম্বৰলৈ প্ৰচুৰ বাৰিষা হয় (২০০০-৩০০০ মিলিমিটাৰ)। মুকলি আকাশৰ তলত হাইড্ৰ'পনিক্স কৰিলে বৰষুণৰ পানী সোমাই টেংক উপচি পৰে আৰু সাৰৰ EC আৰু pH মুহূৰ্ততে নষ্ট কৰি পেলায়। সেয়েহে অসমত ওপৰত ২০০ মাইক্ৰন UV প্লাষ্টিকৰ চালি (Rain shelter dome) আৰু চাৰিওফালে বতাহ চলাচল কৰিবলৈ ৪০-মেশ কীট প্ৰতিৰোধক জাল (Insect Net) ব্যৱহাৰ কৰাটো বাধ্যতামূলক।",
                    keyPoints = listOf(
                        "Always install 200-micron UV polyethylene film over the growing area.",
                        "Maintain open or netted side walls to promote continuous airflow and prevent fungus.",
                        "Slope polyhouse roofs by at least 25 degrees so rainwater runs off quickly."
                    ),
                    hindiKeyPoints = listOf(
                        "ওপৰত ২০০ মাইক্ৰন UV প্লাষ্টিক চাদৰৰ বৰষুণ সুৰক্ষা চালি নিৰ্মাণ কৰক।",
                        "উচ্চ আৰ্দ্ৰতাৰ পৰা বচাবলৈ চাৰিওফালে জাল দি বতাহ চলাচলৰ ব্যৱস্থা ৰাখক।",
                        "চালিখন ২৫ ডিগ্ৰী হেলনীয়াকৈ সাজিব লাগে যাতে পানী জমা নহৈ সহজে বৈ যায়।"
                    )
                ),
                ContentSection(
                    heading = "2. Filtering High Iron in Assam Groundwater & Rainwater Collection",
                    hindiHeading = "২. অসমৰ ভূগৰ্ভস্থ পানীৰ আইৰণ সমস্যা আৰু বৰষুণৰ পানী সংগ্ৰহ",
                    body = "Groundwater across the Brahmaputra basin (Kamrup, Nagaon, Sonitpur, Jorhat, Dibrugarh) often has high iron content (> 2-5 mg/L), turning reddish-brown upon oxidation and clogging drip nozzles. Simple remedy: Pump groundwater into an aeration settling tank with gravel and sand filters, or best of all, harvest pure rainwater from polyhouse roofs! Rainwater has an EC of near zero (0.05 mS/cm) and zero iron, making it pure gold for hydroponics.",
                    hindiBody = "ব্ৰহ্মপুত্ৰ উপত্যকাৰ (কামৰূপ, নগাঁও, শোণিতপুৰ, যোৰহাট, ডিব্ৰুগড় আদি) টিউবৱেলৰ পানীত আইৰণ (লো) বেছি থাকে, যাৰ ফলত পানীখিনি বতাহত ৰঙচুৱা হয় আৰু ড্ৰিপাৰ জাম কৰে। ইয়াৰ সমাধান: পানী টেংকত দিয়াৰ আগতে বালি আৰু নুৰী পাথৰৰ সাধাৰণ ফিল্টাৰ বা এয়াৰেচন কৰক। নাইবা আটাইতকৈ সহজ উপায়—পলিহাউচৰ চালিৰ পৰা বৰষুণৰ পানী টেংকত জমা কৰক (Rainwater harvesting)। বৰষুণৰ পানীৰ EC প্ৰায় শূন্য (০.০৫ mS/cm) আৰু ই হাইড্ৰ'পনিক্সৰ বাবে সোণৰ সমান!",
                    keyPoints = listOf(
                        "Filter borehole water through an aeration sand-gravel filter to precipitate dissolved iron.",
                        "Rainwater harvesting is the highest-purity, zero-cost water source in Assam.",
                        "Never add hydroponic nutrients until raw water EC is checked below 0.3 mS/cm."
                    ),
                    hindiKeyPoints = listOf(
                        "টিউবৱেলৰ পানী বালি আৰু নুৰী পাথৰৰ ফিল্টাৰেৰে পৰিশোধন কৰিহে সাৰ মিহলাব।",
                        "বৰষুণৰ পানী জমা কৰি ব্যৱহাৰ কৰিলে সাৰৰ কাৰ্যক্ষমতা ১০০% পোৱা যায় আৰু খৰচ শূন্য।",
                        "প্ৰাথমিক কেঁচা পানীৰ EC সদায় ০.৩ তকৈ কম হোৱাটো নিশ্চিত কৰক।"
                    )
                ),
                ContentSection(
                    heading = "3. Low-Cost Bamboo Framework (অসমৰ জাতি বাঁহৰ ষ্টেণ্ড)",
                    hindiHeading = "৩. থলুৱা জাতি বাঁহ আৰু ভলুকা বাঁহেৰে কম খৰচী ষ্টেণ্ড",
                    body = "Commercial metal framing is expensive. In Assam, mature Jati and Bholuka bamboo provides incredible structural strength at a fraction of the cost. You can construct sturdy NFT A-frames, Dutch bucket benches, and high-wire trellises for tomatoes and cucumbers using local treated bamboo, slashing setup costs by 50% to 60%.",
                    hindiBody = "লো বা এলুমিনিয়ামৰ দামী পাইপ কিনি হাজাৰ হাজাৰ টকা খৰচ কৰাৰ কোনো প্ৰয়োজন নাই। অসমত উভৈনদী হৈ থকা পকা জাতি বাঁহ আৰু ভলুকা বাঁহেৰে মজবুত NFT A-Frame ষ্টেণ্ড, ডাচ বাকেট বেঞ্চ আৰু তিয়ঁহ-বিলাহীৰ ট্ৰেলিছ নিৰ্মাণ কৰিব পাৰি। ইয়াৰ দ্বাৰা প্ৰাৰম্ভিক মূলধনৰ ৬০% পৰ্যন্ত সাঁচিব পাৰি। বাঁহৰ গুৰিভাগত আলকতৰা (Coal tar) সানি মাটিত পুতিলে বাঁহ কেইবাবছৰো নষ্ট নহয়।",
                    keyPoints = listOf(
                        "Use mature Bholuka bamboo for main load-bearing posts and Jati bamboo for horizontal runners.",
                        "Coat bamboo bases in coal tar to protect against ground moisture and termites.",
                        "Saves 50-60% of setup budget compared to galvanized iron frames."
                    ),
                    hindiKeyPoints = listOf(
                        "মূল খুটিৰ বাবে ভলুকা বাঁহ আৰু ওপৰৰ ক্ৰছবাৰৰ বাবে জাতি বাঁহ ব্যৱহাৰ কৰক।",
                        "মাটিত সোমোৱা বাঁহৰ অংশত আলকতৰা সানি দিলে ঘূণে বা উয়ে নাখায়।",
                        "লোৰ ফ্ৰেমৰ তুলনাত ৬০% ধন ৰাহি হয় আৰু দেখাতো আকৰ্ষণীয় হয়।"
                    )
                )
            )
        )
    )
}
