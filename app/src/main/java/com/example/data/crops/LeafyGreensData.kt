package com.example.data.crops

import com.example.model.CropCategory
import com.example.model.CropStageGuide
import com.example.model.HydroponicCrop
import com.example.model.NutrientRecipe
import com.example.model.PruningGuide

object LeafyGreensData {

    val crops: List<HydroponicCrop> = listOf(
        // ==================== 1. LETTUCE (লেটুচ শাক) ====================
        HydroponicCrop(
            id = "lettuce",
            name = "Lettuce (Butterhead & Romaine)",
            hindiName = "লেটুচ শাক (বাটাৰহেড আৰু ৰমাইন)",
            scientificName = "Lactuca sativa",
            category = CropCategory.LEAFY_GREEN,
            iconEmoji = "🥬",
            shortOverview = "The ultimate beginner crop for hydroponics. Grows ultra-fast, tender, and crisp with zero soil grit. Highly productive in NFT and Kratky setups.",
            hindiShortOverview = "হাইড্ৰ'পনিক্সৰ বাবে আটাইতকৈ সহজ আৰু জনপ্ৰিয় শস্য। মাটি অবিহনে মাত্ৰ ৩৫-৪০ দিনতে অতি সতেজ, ক্ৰিস্পি আৰু ৰোগমুক্ত পাত চপাব পাৰি। অসমৰ জলবায়ুত বাঁহৰ ষ্টেণ্ড বা NFT আৰু ক্ৰেটকি (Kratky) পদ্ধতিৰ বাবে উত্তম।",
            ecMin = 1.0,
            ecMax = 1.4,
            ppm500Min = 500,
            ppm500Max = 700,
            phMin = 5.6,
            phMax = 6.2,
            idealWaterTempMin = 18,
            idealWaterTempMax = 22,
            dayTempMin = 18,
            dayTempMax = 24,
            nightTempMin = 14,
            nightTempMax = 18,
            lightHoursPerDay = 14,
            recommendedDli = "14 - 17 mol/m²/day",
            recommendedSystems = listOf("NFT (Nutrient Film Technique)", "DWC / Kratky Floating Raft", "Ebb & Flow"),
            hindiRecommendedSystems = listOf("NFT (পাইপ পদ্ধতি)", "DWC / ক্ৰেটকি ওপঙা ভেলা পদ্ধতি", "এব এণ্ড ফ্লো"),
            germinationDays = "2 - 4 Days",
            harvestDaysFromSeed = "32 - 42 Days",
            plantSpacingCm = "20 - 25 cm",
            waterPerPlantDaily = "150 - 250 ml",
            seedlingGuide = CropStageGuide(
                stageName = "Germination & Nursery",
                hindiStageName = "গুটি গজালি মেলা আৰু নাৰ্চাৰী",
                durationDays = "10 - 14 Days",
                targetEc = "0.6 - 0.8 mS/cm",
                targetPh = "5.8",
                instructions = listOf(
                    "Soak Rockwool cubes or Oasis plugs in pH 5.5 adjusted water for 30 minutes.",
                    "Place 1-2 seeds per cube at a depth of 3 mm. Do NOT bury deep as lettuce seeds need light to break dormancy.",
                    "Keep in a dark humidity dome at 20-22°C for 48 hours until radicle emerges.",
                    "As soon as green cotyledons appear, provide 14 hours of grow light (PPFD 150-200 µmol/m²/s) to prevent leggy seedlings.",
                    "Bottom feed with half-strength nursery nutrient solution (EC 0.6)."
                ),
                hindiInstructions = listOf(
                    "ৰকউল (Rockwool) বা নাৰিকলৰ ছোবাৰ প্লাগ pH ৫.৫ পানীত ৩০ মিনিট তিয়াই ৰাখক।",
                    "প্ৰতিটো কিউবত ১-২ টাকৈ গুটি ৩ মিলিমিটাৰ গভীৰতাত দিয়ক। লেটুচৰ গুটি বেছি গভীৰত পুতিব নালাগে কাৰণ গজালিৰ বাবে পোহৰৰ প্ৰয়োজন।",
                    "আৰ্দ্ৰতা ঢাকনিৰে ৪৮ ঘণ্টা ২০-২২ ডিগ্ৰী উষ্ণতাত এন্ধাৰত ৰাখক।",
                    "দুটা সেউজীয়া পাত ওলোৱাৰ লগে লগে দৈনিক ১৪ ঘণ্টা পোহৰ দিয়ক যাতে পুলিটো লাহী আৰু দুৰ্বল নহয়।",
                    "তলৰ পৰা পাতল সাৰ মিশ্ৰিত পানী (EC 0.6) যোগান ধৰক।"
                ),
                keyTips = listOf(
                    "High temperature (>26°C) induces seed dormancy. Keep germination area cool.",
                    "Never let rockwool dry out, but avoid waterlogging to prevent damp-off fungus."
                ),
                hindiKeyTips = listOf(
                    "২৬ ডিগ্ৰী চেলচিয়াছতকৈ অধিক গৰম হ'লে লেটুচৰ গুটি নগজে (Thermal dormancy)। নাৰ্চাৰীখন ঠাণ্ডা ঠাইত ৰাখক।",
                    "বেছি পানী জমা হৈ থাকিব নিদিব যাতে ভেঁকুৰ বা পচি যোৱা ৰোগ নহয়।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Main Hydroponic System Growth",
                hindiStageName = "মূল হাইড্ৰ'পনিক ব্যৱস্থাত বৃদ্ধি",
                durationDays = "20 - 28 Days",
                targetEc = "1.1 - 1.3 mS/cm",
                targetPh = "5.8 - 6.2",
                instructions = listOf(
                    "Transplant when seedlings have 3-4 true leaves and white roots emerge from bottom of net pot.",
                    "Transfer into 2-inch or 3-inch net pots filled with clay pebbles (hydroton) or directly into NFT channels.",
                    "Maintain continuous nutrient water flow in NFT (1.5 to 2.0 Liters/min per channel).",
                    "Maintain oscillating air circulation fan over crop canopy to prevent micro-climates."
                ),
                hindiInstructions = listOf(
                    "৩-৪ খিলা প্ৰকৃত পাত আৰু তললৈ বগা শিপা ওলালে পুলিটো মূল চিষ্টেমলৈ স্থানান্তৰ কৰক।",
                    "২ ইঞ্চি নেট পটত হাইড্ৰ'টন (Clay pebbles) ব্যৱহাৰ কৰি NFT চেনেল বা পাইপত বহুৱাওক।",
                    "NFT পাইপত প্ৰতি মিনিটত ১.৫ ৰ পৰা ২ লিটাৰ সাৰৰ পানী অবিৰতভাৱে প্ৰবাহিত হ'ব দিয়ক।",
                    "পাতৰ ওপৰত ফেনৰ জৰিয়তে বতাহ চলাচল অব্যাহত ৰাখক যাতে পাতৰ আগ ক'লা পৰা ৰোগ (Tipburn) নহয়।"
                ),
                keyTips = listOf(
                    "Direct airflow over leaves is mandatory to transport Calcium into expanding inner leaf tips and prevent 'Tipburn'.",
                    "If reservoir water exceeds 24°C in summer, use shade nets and aerate aggressively to avoid Pythium root rot."
                ),
                hindiKeyTips = listOf(
                    "অসমৰ গৰমৰ দিনত পানীৰ উষ্ণতা ২৪ ডিগ্ৰীৰ তলত ৰাখিবলৈ ৰিজাৰ্ভাৰটো ছাঁ পৰা ঠাইত বা মাটিৰ তলত পোতি ৰাখক।",
                    "শিপাত যাতে প্ৰচুৰ অক্সিজেন পায় তাৰ বাবে এয়াৰ পাম্প সদায় চলাই ৰাখক।"
                )
            ),
            fruitingGuide = null,
            pollinationGuide = null,
            pruningGuide = PruningGuide(
                trellisingMethod = "No trellising needed. Stays compact within net pot.",
                hindiTrellisingMethod = "কোনো ট্ৰেলিচ বা জাঁপৰ প্ৰয়োজন নাই। নেট পটতে সুন্দৰকৈ বাঢ়ে।",
                suckeringRules = "None. Remove any yellowing bottom senescent leaves.",
                hindiSuckeringRules = "তলৰ পুৰণি হালধীয়া পৰা পাতবোৰ মাজে মাজে কাটি পৰিষ্কাৰ কৰি ৰাখক।",
                leafPruning = "Harvest outer leaves continuously (Cut-and-come-again) or harvest whole head.",
                hindiLeafPruning = "বাহিৰৰ ডাঙৰ পাতবোৰ ছিঙি ছিঙি খাব পাৰি (Cut-and-come-again) বা সম্পূৰ্ণ গছজোপা একেলগে কাটিব পাৰি।",
                toppingRule = "Do not top. If central flower stalk bolts (stretches upward), harvest immediately before leaves turn bitter.",
                hindiToppingRule = "ওপৰৰ অংশ কাটিব নালাগে। যদি গৰমৰ বাবে মাজৰ পৰা ফুল ওলাবলৈ ধৰে, লগে লগে পাতবোৰ চপাই পেলাওক কাৰণ পলম হ'লে পাত তিতা হৈ পৰে।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "8-15-36 (Leafy formula) + Calcium Nitrate + Magnesium Sulfate",
                floweringFruitingNpk = "N/A (Harvested purely in vegetative phase)",
                partADetails = "Calcium Nitrate [Ca(NO3)2]: 0.9 g/L",
                partBDetails = "Masterblend / Leafy Hydro NPK (8-15-36) + Micronutrients: 0.9 g/L",
                partCDetails = "Epsom Salt [MgSO4·7H2O]: 0.45 g/L",
                mixingGuide = "Dissolve Part B (NPK) first, then Part C (Epsom Salt). Add Part A (Calcium Nitrate) LAST in fully diluted water. NEVER mix Part A & B in concentrate to prevent Calcium Sulfate precipitation.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত প্ৰথমে ৯০ গ্ৰাম NPK (Part B) গুলক, তাৰ পিছত ৪৫ গ্ৰাম এপচম চল্ট (Part C)। সম্পূৰ্ণ মিলি যোৱাৰ পিছত শেষত ৯০ গ্ৰাম কেলচিয়াম নাইট্ৰেট (Part A) মিহলাওক। কেতিয়াও A আৰু B একেলগে শুকান অৱস্থাত নিমিলিওৱাব।",
                flushSchedule = "Flush with fresh clean rainwater or RO water 24 hours prior to harvest for crisp, sweet flavor.",
                hindiFlushSchedule = "ফচল চপোৱাৰ ২৪ ঘণ্টা পূৰ্বে কেৱল বিশুদ্ধ পানী প্ৰবাহিত কৰক যাতে পাতত কোনো নিমখীয়া গন্ধ নাথাকে আৰু সোৱাদ মিঠা-ক্ৰিস্পি হয়।"
            ),
            harvestingGuide = "Harvest early morning when leaves are fully turgid and hydrated. Cut head at base with sanitized knife, leaving root core, or harvest root-on for longer shelf life (up to 2 weeks in fridge).",
            hindiHarvestingGuide = "ৰাতিপুৱা পাতত পানী ভৰি থকা সময়ত ধাৰাল চাফা কটাৰীৰে শিপাৰ ঠিক ওপৰত কাটি চপাওক। নাইবা শিপাসহ তুলি পানীৰ স্প্ৰে' কৰি ফ্ৰিজত থলে ১৫ দিনলৈকে সম্পূৰ্ণ সতেজ হৈ থাকে।",
            commonPestsAndDiseases = listOf(
                "Tip Burn (Lack of airflow / low transpiration causing Calcium deficiency in inner leaves)",
                "Bolting (Early flowering and bitter taste caused by water temp > 24°C or ambient temp > 27°C)",
                "Pythium Root Rot (Brown slimy roots due to warm, de-oxygenated water)",
                "Aphids (Small green/black bugs on underside of leaves; treat with 3ml/L cold-pressed Neem oil spray)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "টিপ বাৰ্ণ (পাতৰ আগ ক'লা পৰা - বতাহ চলাচল আৰু কেলচিয়ামৰ অভাৱৰ বাবে হয়)",
                "বল্টিং (গৰমৰ বাবে অপৈণত অৱস্থাতে ফুল ওলোৱা আৰু পাত তিতা হোৱা)",
                "শিপা পচা ৰোগ (পানীত অক্সিজেনৰ নাটনি আৰু গৰমৰ বাবে শিপা মুগা আৰু বিজলুৱা হোৱা)",
                "মাহী পোক বা মোৱা পোক (পাতৰ তলত থকা পোক - প্ৰতি লিটাৰ পানীত ৩ মিলি নিম তেল স্প্ৰে' কৰক)"
            )
        ),

        // ==================== 2. SPINACH (পালেং শাক) ====================
        HydroponicCrop(
            id = "spinach",
            name = "Spinach (Palak)",
            hindiName = "পালেং শাক (Hydroponic Spinach)",
            scientificName = "Spinacia oleracea",
            category = CropCategory.LEAFY_GREEN,
            iconEmoji = "🍃",
            shortOverview = "Nutrient-dense iron-rich leafy vegetable. Requires cool water temperatures (18-20°C) and exceptionally high dissolved oxygen in the root zone.",
            hindiShortOverview = "আইৰণ আৰু ভিটামিনেৰে ভৰপূৰ পুষ্টিকৰ শাক। পালেং শাকৰ শিপাই অতিমাত্ৰা দ্ৰৱীভূত অক্সিজেন (DO > 7 PPM) আৰু ঠাণ্ডা পানী পছন্দ কৰে। অসমৰ শীতকালত বা ছাঁ-ঘৰত ইয়াৰ উৎপাদন অতি লাভজনক।",
            ecMin = 1.4,
            ecMax = 2.0,
            ppm500Min = 700,
            ppm500Max = 1000,
            phMin = 6.0,
            phMax = 6.7,
            idealWaterTempMin = 16,
            idealWaterTempMax = 20,
            dayTempMin = 18,
            dayTempMax = 22,
            nightTempMin = 12,
            nightTempMax = 16,
            lightHoursPerDay = 12,
            recommendedDli = "12 - 15 mol/m²/day",
            recommendedSystems = listOf("NFT with steep slope", "DWC with massive aeration", "Kratky (Winter season)"),
            hindiRecommendedSystems = listOf("NFT (অধিক ঢালযুক্ত পাইপ)", "DWC (অধিক অক্সিজেন এয়াৰ পাম্পৰ সৈতে)", "ক্ৰেটকি (শীতকালৰ বাবে)"),
            germinationDays = "4 - 8 Days",
            harvestDaysFromSeed = "35 - 45 Days",
            plantSpacingCm = "15 - 20 cm",
            waterPerPlantDaily = "150 - 200 ml",
            seedlingGuide = CropStageGuide(
                stageName = "Seed Stratification & Germination",
                hindiStageName = "গুটি সজীৱকৰণ আৰু অংকুৰণ",
                durationDays = "12 - 16 Days",
                targetEc = "0.8 mS/cm",
                targetPh = "6.2",
                instructions = listOf(
                    "Soak spinach seeds in cool water for 12 hours.",
                    "Wrap in damp paper towel inside a ziplock bag and place in refrigerator (4-8°C) for 3 days (Cold Stratification) to break seed coat dormancy.",
                    "Sow 2-3 seeds per rockwool plug, cover with light vermiculite layer.",
                    "Maintain nursery tray at 18-20°C with gentle ambient cooling."
                ),
                hindiInstructions = listOf(
                    "পালেঙৰ গুটিবোৰ ১২ ঘণ্টা ঠাণ্ডা পানীত তিয়াই ৰাখক।",
                    "গুটিবোৰ তিতা কাপোৰ বা টিচুত মেৰিয়াই ৩ দিন ফ্ৰিজত (৪-৮ ডিগ্ৰী) থৈ দিয়ক (Cold Stratification)। ইয়াৰ দ্বাৰা গুটিৰ কঠিন আৱৰণ কোমল হয় আৰু ৯০% গুটি গজে।",
                    "ৰকউলত ২-৩ টাকৈ গুটি দি পাতলভাৱে ঢাকি দিয়ক।",
                    "নাৰ্চাৰীৰ উষ্ণতা ১৮-২০ ডিগ্ৰীত নিয়ন্ত্ৰণ কৰি ৰাখক।"
                ),
                keyTips = listOf(
                    "Spinach seeds germinate poorly above 22°C (germination rate drops from 90% to below 40%).",
                    "Do not over-saturate media; spinach radicles rot quickly in soggy conditions."
                ),
                hindiKeyTips = listOf(
                    "২২ ডিগ্ৰীৰ অধিক গৰমত পালেঙৰ গুটি গজালি মেলাৰ ক্ষমতা বহুগুণে কমি যায়।",
                    "গুটি থোৱা স্থানত বেছি পানী জমা হৈ থাকিব নিদিব, কাৰণ পালেঙৰ মূল শিপা সোনকালে পচি যায়।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Active Foliage Growth",
                hindiStageName = "পাতৰ তীব্ৰ বৃদ্ধি",
                durationDays = "20 - 30 Days",
                targetEc = "1.6 - 1.9 mS/cm",
                targetPh = "6.0 - 6.5",
                instructions = listOf(
                    "Transplant net pots into channels when roots penetrate out of the plug.",
                    "Keep water temperature strictly below 21°C to prevent Pythium root rot, to which spinach is sensitive.",
                    "Ensure air stones run 24/7 if using DWC (Dissolved Oxygen > 7 ppm).",
                    "Provide photoperiod of maximum 12 hours. Long day lengths (>14 hours) trigger bolting."
                ),
                hindiInstructions = listOf(
                    "শিপা বাহিৰলৈ ওলোৱাৰ লগে লগে নেট পটবোৰ NFT পাইপ বা DWC পাত্ৰত স্থানান্তৰ কৰক।",
                    "পানীৰ উষ্ণতা সদায় ২১ ডিগ্ৰীৰ তলত ৰাখক, কাৰণ পালেং শিপা পচা ৰোগৰ প্ৰতি অতি সংবেদনশীল।",
                    "DWC ব্যৱহাৰ কৰিলে এয়াৰ পাম্প ২৪ ঘণ্টাই চলাই ৰাখক যাতে পানীত অক্সিজেনৰ মাত্ৰা ৭ PPM তকৈ অধিক থাকে।",
                    "দৈনিক ১০-১২ ঘণ্টাতকৈ অধিক পোহৰ নিদিব, কাৰণ দীঘলীয়া পোহৰে ফুল ফুলাই দিয়ে।"
                ),
                keyTips = listOf(
                    "Spinach has a higher Iron (Fe) and Magnesium requirement. Ensure chelated iron (Fe-EDDHA) is maintained.",
                    "Keep pH in the slightly higher range (6.0 - 6.5) compared to lettuce."
                ),
                hindiKeyTips = listOf(
                    "পালেং শাকত আইৰণ আৰু মেগনেছিয়ামৰ প্ৰয়োজন বেছি। গতিকে চিলেটেড আইৰণ (Fe-EDDHA) সাৰত সঠিকভাৱে ৰাখক।",
                    "লেটুচৰ তুলনাত পালেঙৰ বাবে pH সামান্য বেছি (৬.০ ৰ পৰা ৬.৫) ৰাখিব লাগে।"
                )
            ),
            fruitingGuide = null,
            pollinationGuide = null,
            pruningGuide = PruningGuide(
                trellisingMethod = "Self-supporting rosette growth.",
                hindiTrellisingMethod = "কোনো ট্ৰেলিচৰ প্ৰয়োজন নাই, সৰুকৈ জোপোহা বান্ধি বৃদ্ধি পায়।",
                suckeringRules = "None.",
                hindiSuckeringRules = "অপ্ৰয়োজনীয়।",
                leafPruning = "Harvest largest outer leaves 3-4 at a time, allowing inner leaves to keep growing.",
                hindiLeafPruning = "প্ৰতিজোপা গছৰ পৰা বাহিৰৰ ডাঙৰ ৩-৪ খিলা পাত কাটি লওক, ভিতৰৰ নতুন পাতবোৰ বাঢ়ি থাকিব।",
                toppingRule = "Harvest entirely before flowering.",
                hindiToppingRule = "ফুল ওলোৱাৰ পূৰ্বেই সম্পূৰ্ণ ফচল চপাই পেলাওক।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "10-15-32 + Fe-EDDHA (Chelated Iron) + Calcium Nitrate",
                floweringFruitingNpk = "N/A",
                partADetails = "Calcium Nitrate: 1.0 g/L",
                partBDetails = "Hydroponic Greens NPK: 1.0 g/L + 0.05 g/L Chelated Iron (Fe)",
                partCDetails = "Epsom Salt (MgSO4): 0.5 g/L",
                mixingGuide = "Mix Part B & Iron first, followed by Part C. Finally add Part A in tank. Mix thoroughly with circulation pump.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত ১০০ গ্ৰাম NPK আৰু ৫ গ্ৰাম আইৰণ গুলক। তাৰ পিছত ৫০ গ্ৰাম এপচম চল্ট আৰু শেষত ১০০ গ্ৰাম কেলচিয়াম নাইট্ৰেট মিহলাওক।",
                flushSchedule = "Clean flush water for 24-48 hours before harvest.",
                hindiFlushSchedule = "চপোৱাৰ ১-২ দিন পূৰ্বে বিশুদ্ধ পানীৰে চলাই ৰাখক।"
            ),
            harvestingGuide = "Continuous harvest method: Pick outer mature leaves with clean scissors when they reach 10-12 cm in length. Plant will regenerate new leaves for 4-6 weeks.",
            hindiHarvestingGuide = "পাতবোৰ ১০-১২ চেমি দীঘল হ'লে কেঁচীৰে বাহিৰৰ পাতবোৰ কাটি চপাওক। একেজোপা গছৰ পৰাই একেৰাহে ডেৰ মাহলৈকে নতুন পাত পাই থাকিব পাৰি।",
            commonPestsAndDiseases = listOf(
                "Pythium Root Rot (Number one enemy of hydroponic spinach; roots turn slimy brown)",
                "Downy Mildew (Yellow angular spots on top leaf surface with purplish grey fuzz underneath)",
                "Leaf Miners (Winding white trails inside leaf tissue; use yellow sticky traps)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "শিপা পচা বেমাৰ (পানীত বেছি গৰম আৰু অক্সিজেনৰ নাটনিৰ বাবে শিপা ক'লা-মুগা পৰে)",
                "ডাউনি মিলডিউ (পাতৰ তলফালে ধূসৰ বৰণৰ ভেঁকুৰ আৰু ওপৰত হালধীয়া দাগ)",
                "পাত খোৱা পোকে কৰা দাগ (পাতৰ মাজত বগা আঁক - হালধীয়া আঠাযুক্ত কাৰ্ড ব্যৱহাৰ কৰক)"
            )
        ),

        // ==================== 3. CORIANDER & ASSAM CULANTRO (ধনিয়া আৰু মান ধনিয়া) ====================
        HydroponicCrop(
            id = "coriander",
            name = "Coriander & Culantro (Dhania / Maan Dhania)",
            hindiName = "ধনিয়া আৰু অসমীয়া মান ধনিয়া",
            scientificName = "Coriandrum sativum / Eryngium foetidum",
            category = CropCategory.LEAFY_GREEN,
            iconEmoji = "🌿",
            shortOverview = "High-demand aromatic herbs that fetch premium market prices. Both traditional Coriander and Assam's native saw-toothed Maan Dhania thrive spectacularly in hydroponics.",
            hindiShortOverview = "অসমৰ বজাৰত সদায়েই উচ্চ মূল্য থকা সুগন্ধি শাক। সাধাৰণ ধনিয়াৰ উপৰিও অসমৰ অতি আদৰৰ খাঁটি 'মান ধনিয়া' হাইড্ৰ'পনিক্সত মাটিৰ তুলনাত দুগুণ বেগেৰে বাঢ়ে আৰু ইয়াৰ সুবাস অতি প্ৰবল হয়।",
            ecMin = 1.2,
            ecMax = 1.8,
            ppm500Min = 600,
            ppm500Max = 900,
            phMin = 5.8,
            phMax = 6.4,
            idealWaterTempMin = 18,
            idealWaterTempMax = 23,
            dayTempMin = 18,
            dayTempMax = 25,
            nightTempMin = 14,
            nightTempMax = 19,
            lightHoursPerDay = 12,
            recommendedDli = "12 - 14 mol/m²/day",
            recommendedSystems = listOf("NFT Channels", "DWC / Floating Raft", "Ebb & Flow Beds"),
            hindiRecommendedSystems = listOf("NFT পাইপ পদ্ধতি", "DWC বা ক্ৰেটকি পদ্ধতি", "এব এণ্ড ফ্লো"),
            germinationDays = "5 - 10 Days",
            harvestDaysFromSeed = "35 - 50 Days",
            plantSpacingCm = "12 - 15 cm",
            waterPerPlantDaily = "100 - 180 ml",
            seedlingGuide = CropStageGuide(
                stageName = "Seed Cracking & Germination",
                hindiStageName = "গুটি ভঙা আৰু পুলি প্ৰস্তুত",
                durationDays = "14 - 18 Days",
                targetEc = "0.7 mS/cm",
                targetPh = "6.0",
                instructions = listOf(
                    "Gently crush coriander seed mericarps between palms or a rolling pin into two halves (each sphere contains 2 seeds).",
                    "Soak split seeds in lukewarm water for 18-24 hours with a drop of 3% hydrogen peroxide or seaweed extract.",
                    "Sow 4-6 split seeds per rockwool plug or cocopeat net cup to form a lush bushy bunch.",
                    "Maintain humidity tray at 20-22°C until sprouts show."
                ),
                hindiInstructions = listOf(
                    "ধনিয়াৰ গোটা গুটিবোৰ হাতৰ তলুৱাৰে বা বেলনাৰে লাহেকৈ চাপ দি দুফাল কৰক (প্ৰতিটো গুটিত ২ টাকৈ বীজ থাকে)। মান ধনিয়াৰ গুটি অতি সৰু, সেয়ে পোনে পোনে দিয়ক।",
                    "গুটিবোৰ কুহুমীয়া পানীত ১৮-২৪ ঘণ্টা তিয়াই ৰাখক।",
                    "প্ৰতিটো নেট পট বা ৰকউলত ৪-৬ টাকৈ গুটি দিয়ক যাতে জোপোহা হৈ গজি উঠে।",
                    "নাৰ্চাৰী ট্ৰে'খন ২০-২২ ডিগ্ৰী উষ্ণতাত আৰ্দ্ৰ কৰি ৰাখক।"
                ),
                keyTips = listOf(
                    "Cracking the outer husk increases germination speed by 5-7 days.",
                    "Never let nursery plugs dry out during germination stage."
                ),
                hindiKeyTips = listOf(
                    "গুটি দুফাল কৰি তিয়ালে গজালি মেলাৰ সময় প্ৰায় এসপ্তাহ আগবাঢ়ি যায়।",
                    "গজালি নোলোৱালৈকে ৰকউল শুকাবলৈ নিদিব।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Aromatic Foliage Production",
                hindiStageName = "সুগন্ধি পাতৰ বিকাশ",
                durationDays = "20 - 30 Days",
                targetEc = "1.4 - 1.7 mS/cm",
                targetPh = "5.8 - 6.2",
                instructions = listOf(
                    "Move net pots into NFT channels when root cluster reaches 5 cm length.",
                    "Keep water EC steady between 1.4 to 1.7. High nitrogen levels promote dark green aromatic foliage.",
                    "Ensure day temperatures do not cross 26°C to prevent early bolting.",
                    "Maan Dhania thrives with moderate shaded sunlight (50% agro-shade net)."
                ),
                hindiInstructions = listOf(
                    "শিপা প্ৰায় ৫ চেমি ওলোৱাৰ পিছত নেট পটবোৰ NFT পাইপ বা চিষ্টেমলৈ আনক।",
                    "সাৰৰ EC মাত্ৰা ১.৪ ৰ পৰা ১.৭ ৰ ভিতৰত ৰাখক। নাইট্ৰ'জেনে পাতবোৰ ডাঠ সেউজীয়া আৰু সুগন্ধি কৰে।",
                    "উষ্ণতা ২৬ ডিগ্ৰীৰ ওপৰত যাবলৈ নিদিব, অন্যথা ফুল ওলাই সুবাস কমি যায়।",
                    "মান ধনিয়াৰ বাবে ৫০% সেউজীয়া ছাঁ-জাল (Green Shade Net) ব্যৱহাৰ কৰিলে পাতবোৰ ডাঙৰ আৰু কোমল হয়।"
                ),
                keyTips = listOf(
                    "High temperatures induce flowering stem formation. Keep reservoir below 22°C.",
                    "Maan Dhania has saw-tooth edges and produces harvestable leaves for over 6 months."
                ),
                hindiKeyTips = listOf(
                    "অধিক গৰমে ফুল ফুলাই দিয়ে, সেয়েহে পানী সদায় শীতল কৰি ৰাখক।",
                    "মান ধনিয়া এবাৰ ৰুলে একেৰাহে ৬ মাহৰো অধিক কাল কাটি কাটি বিক্ৰী কৰিব পাৰি।"
                )
            ),
            fruitingGuide = null,
            pollinationGuide = null,
            pruningGuide = PruningGuide(
                trellisingMethod = "Self-supporting compact bush.",
                hindiTrellisingMethod = "কোনো সাৱলম্বী তাঁৰ বা জাঁপৰ প্ৰয়োজন নাই।",
                suckeringRules = "None.",
                hindiSuckeringRules = "প্ৰয়োজন নাই।",
                leafPruning = "Harvest outer mature stalks leaving the growing crown intact.",
                hindiLeafPruning = "বাহিৰৰ ডাঙৰ পাত আৰু ঠাৰিবোৰ কাটি লওক, কেন্দ্ৰীয় অংশৰ পৰা নতুন ঠাল বাঢ়ি থাকিব।",
                toppingRule = "Pinch off any premature central flower buds to prolong leafy life.",
                hindiToppingRule = "মাজত ফুলৰ কুঁহি দেখা পালেই লগে লগে কাটি পেলাওক যাতে গছজোপাই অধিক পাত দিয়ে।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "12-10-30 + Micronutrients (Boron, Iron, Zinc) + Calcium Nitrate",
                floweringFruitingNpk = "N/A",
                partADetails = "Calcium Nitrate: 0.9 g/L",
                partBDetails = "Leafy Herb NPK: 0.9 g/L",
                partCDetails = "Magnesium Sulfate (Epsom Salt): 0.4 g/L",
                mixingGuide = "Mix Part B thoroughly, add Part C, and add Part A last. Maintain pH around 6.0.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত ৯০ গ্ৰাম NPK, ৪০ গ্ৰাম এপচম চল্ট আৰু শেষত ৯০ গ্ৰাম কেলচিয়াম নাইট্ৰেট মিহলাই pH ৬.০ ত নিৰ্ধাৰণ কৰক।",
                flushSchedule = "Clean water flush 24 hours before harvest.",
                hindiFlushSchedule = "বজাৰলৈ পঠিওৱাৰ ২৪ ঘণ্টা পূৰ্বে কেৱল বিশুদ্ধ পানী চলাই সুবাস আৰু সতেজতা বৃদ্ধি কৰক।"
            ),
            harvestingGuide = "Cut mature stems 3 cm above the net pot surface. For Maan Dhania, cut full-sized serrated leaves individually.",
            hindiHarvestingGuide = "নেট পটৰ ৩ চেমি ওপৰত ধাৰাল কেঁচীৰে কাটি মুঠা বান্ধক। মান ধনিয়াৰ ক্ষেত্ৰত ডাঙৰ ডাঙৰ কাইটেলীয়া পাতবোৰ কাটি লওক।",
            commonPestsAndDiseases = listOf(
                "Powdery Mildew (White powdery fungal growth under humid conditions; increase air flow)",
                "Bacterial Leaf Spot (Water-soaked dark lesions; avoid splashing water on leaves)",
                "Aphids (Spray neem oil at 2-3 ml/L)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "পাউডাৰী মিলডিউ (পাতত বগা পাউদাৰ সদৃশ ভেঁকুৰ - বতাহ চলাচল বঢ়াওক)",
                "পাতৰ বেক্টেৰিয়াজনিত দাগ (পাতৰ ওপৰত পানী ছটিওৱাৰ পৰা বিৰত থাকক)",
                "মোৱা পোক বা মাহী পোক (৩ মিলি নিম তেল স্প্ৰে' কৰক)"
            )
        ),

        // ==================== 4. MINT (পুদিনা পাত) ====================
        HydroponicCrop(
            id = "mint",
            name = "Mint (Pudina)",
            hindiName = "পুদিনা পাত (Spearmint / Peppermint)",
            scientificName = "Mentha spicata",
            category = CropCategory.LEAFY_GREEN,
            iconEmoji = "🌱",
            shortOverview = "Super vigorous, aromatic perennial herb. Extremely forgiving and easy for beginners. Spreads prolifically via runners and roots effortlessly from stem cuttings.",
            hindiShortOverview = "অতি দ্ৰুত বাঢ়িব পৰা সৰ্বাধিক সহজ আৰু সুগন্ধি শাক। গুটিৰ সলনি কেৱল ডাল কাটি ৰুলেই হাইড্ৰ'পনিক্সত মাত্ৰ কেইদিনমানতে প্ৰচুৰ শিপা ওলাই জোপোহা হৈ পৰে। বছৰৰ বাৰমাহেই ইয়াৰ চপোৱা সম্ভৱ।",
            ecMin = 1.4,
            ecMax = 2.2,
            ppm500Min = 700,
            ppm500Max = 1100,
            phMin = 5.8,
            phMax = 6.5,
            idealWaterTempMin = 18,
            idealWaterTempMax = 24,
            dayTempMin = 20,
            dayTempMax = 28,
            nightTempMin = 15,
            nightTempMax = 20,
            lightHoursPerDay = 14,
            recommendedDli = "14 - 16 mol/m²/day",
            recommendedSystems = listOf("NFT Channels", "DWC Bubbler", "Dutch Bucket / Media Beds"),
            hindiRecommendedSystems = listOf("NFT পাইপ", "DWC পানীৰ বাকেট", "ক্ৰেটকি বা ডাট্চ বাকেট"),
            germinationDays = "Rooting: 3 - 5 Days from cuttings",
            harvestDaysFromSeed = "25 - 30 Days from cutting",
            plantSpacingCm = "15 - 20 cm",
            waterPerPlantDaily = "180 - 280 ml",
            seedlingGuide = CropStageGuide(
                stageName = "Stem Cutting Propagation",
                hindiStageName = "ডাল কাটি নতুন পুলি প্ৰস্তুত (Cuttings)",
                durationDays = "7 - 10 Days",
                targetEc = "0.8 - 1.0 mS/cm",
                targetPh = "6.0",
                instructions = listOf(
                    "Cut 10-12 cm fresh healthy mint stems right below a leaf node.",
                    "Strip off bottom 5 cm leaves, leaving 4-6 top leaves.",
                    "Place stems in net pots with clay pebbles in aerated water.",
                    "Vigorous white roots emerge within 72-96 hours without any rooting hormone."
                ),
                hindiInstructions = listOf(
                    "পুদিনা গছৰ পৰা ১০-১২ চেমি সতেজ ডাল এটা গাঁঠিৰ তলত কাটি লওক।",
                    "তলৰ ৫ চেমি অংশৰ পাতবোৰ এৰুৱাই ওপৰত ৪-৬ খিলা পাত ৰাখক।",
                    "হাইড্র'টন বা ক্লে' পেবল দি নেট পটত বহুৱাই সামান্য পানীত ৰাখক।",
                    "মাত্ৰ ৩-৪ দিনৰ ভিতৰতেই কোনো হৰম'ন অবিহনেই প্ৰচুৰ বগা শিপা ওলাই পৰিব।"
                ),
                keyTips = listOf(
                    "Mint grows 3x faster from stem cuttings than from microscopic seeds.",
                    "Change propagation water every 48 hours to prevent stem rot."
                ),
                hindiKeyTips = listOf(
                    "গুটিৰ তুলনাত ডাল কাটি ৰুলে ৩ গুণ বেছি দ্ৰুত গতিত পুলি হয়।",
                    "শিপা নোলোৱালৈকে পানী পৰিষ্কাৰ কৰি ৰাখক।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Rapid Runner & Leaf Expansion",
                hindiStageName = "দ্ৰুত শাখা-প্ৰশাখা আৰু পাতৰ বৃদ্ধি",
                durationDays = "15 - 25 Days",
                targetEc = "1.6 - 2.0 mS/cm",
                targetPh = "5.8 - 6.4",
                instructions = listOf(
                    "Transfer rooted pots to main NFT or DWC system.",
                    "Pinch growing tips when stem reaches 15 cm to trigger massive branching from lower leaf nodes.",
                    "Keep water oxygenated to support vigorous dense root mass."
                ),
                hindiInstructions = listOf(
                    "শিপা ওলোৱাৰ পিছত মূল চিষ্টেমলৈ স্থানান্তৰ কৰক।",
                    "ডালটো ১৫ চেমি ওখ হ'লেই ওপৰৰ আগটো চিঙি দিয়ক (Pinching)। ইয়াৰ ফলত কাষৰ পৰা নতুন বহুতো ঠাল ওলাই জোপোহা হ'ব।",
                    "পানীত সদায় পৰ্যাপ্ত অক্সিজেন যোগান ধৰি ৰাখক।"
                ),
                keyTips = listOf(
                    "Regular pinching doubles yields within 14 days.",
                    "Clean pump filters regularly as mint roots grow very long and dense."
                ),
                hindiKeyTips = listOf(
                    "আগ চিঙি দিলে মাত্ৰ দুসপ্তাহত ফচল দুগুণ বৃদ্ধি পায়।",
                    "পুদিনাৰ শিপা বহুত দীঘল হয়, সেয়েহে পাইপ যাতে জাম নহয় লক্ষ্য ৰাখক।"
                )
            ),
            fruitingGuide = null,
            pollinationGuide = null,
            pruningGuide = PruningGuide(
                trellisingMethod = "Self-supporting cascading herb.",
                hindiTrellisingMethod = "কোনো ট্ৰেলিচ নালাগে, পাত্ৰৰ কাষেৰে তললৈ ধুনীয়াকৈ ওলমি পৰে।",
                suckeringRules = "None. Branching is encouraged.",
                hindiSuckeringRules = "শাখা-প্ৰশাখা যিমানে বাঢ়ে সিমানেই উৎপাদন বেছি হয়।",
                leafPruning = "Trim entire shoots down by 50% periodically to encourage young tender growth.",
                hindiLeafPruning = "মাজে মাজে গছজোপাৰ ৫০% আগ কাটি লওক যাতে নতুন কোমল ডাল ওলায়।",
                toppingRule = "Pinch top flowers immediately as flowering reduces essential menthol oil concentration.",
                hindiToppingRule = "ফুল দেখা পালেই চিঙি পেলাওক, কাৰণ ফুলে পুদিনাৰ সুবাস আৰু গুণ কমাই পেলায়।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "10-15-32 + Extra Potassium + Calcium Nitrate",
                floweringFruitingNpk = "N/A",
                partADetails = "Calcium Nitrate: 1.0 g/L",
                partBDetails = "Masterblend Greens: 1.0 g/L",
                partCDetails = "Epsom Salt: 0.5 g/L",
                mixingGuide = "Dissolve Part B, then Part C, finish with Part A.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত ১০০ গ্ৰাম NPK, ৫০ গ্ৰাম এপচম চল্ট আৰু ১০০ গ্ৰাম কেলচিয়াম নাইট্ৰেট মিহলাওক।",
                flushSchedule = "Clean flush 24 hours prior to commercial harvest.",
                hindiFlushSchedule = "চপোৱাৰ এদিন আগতে বিশুদ্ধ পানীৰে চলাই সতেজ সুবাস উপভোগ কৰক।"
            ),
            harvestingGuide = "Snip stems 5 cm above media. Cut frequently; harvest stimulates new leafy side-shoots indefinitely.",
            hindiHarvestingGuide = "নেট পটৰ ৫ চেমি ওপৰত কাটি লওক। যিমানে বেছি কাটিব সিমানেই নতুনকৈ বাঢ়ি থাকিব।",
            commonPestsAndDiseases = listOf(
                "Mint Rust (Orange/brown pustules under leaves; remove affected foliage immediately)",
                "Spider Mites (Fine webbing under leaves in dry air; mist leaves with clean water)",
                "Aphids (Treat with cold-pressed neem spray)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "মিণ্ট ৰাষ্ট বা মামৰে ধৰা ৰোগ (পাতৰ তলত তামবৰণীয়া দাগ - আক্ৰান্ত পাত কাটি পেলাওক)",
                "মকৰা বা স্পাইডাৰ মাইটছ (পাতৰ তলত মিহি জাল - বতাহ আৰু আৰ্দ্ৰতা বঢ়াওক)",
                "মাহী পোক (নিম তেল স্প্ৰে' কৰক)"
            )
        ),

        // ==================== 5. ASSAM LAI XAK (অসমৰ ঐতিহ্যবাহী লাই শাক) ====================
        HydroponicCrop(
            id = "lai_xak",
            name = "Assam Mustard Green (Lai Xak)",
            hindiName = "অসমৰ লাই শাক (Assam Lai Xak)",
            scientificName = "Brassica juncea",
            category = CropCategory.LEAFY_GREEN,
            iconEmoji = "🥬",
            shortOverview = "Assam's most beloved indigenous leafy green. In hydroponics, Lai Xak grows exceptionally fast with zero grit, zero chemical sprays, and tender leaves that retain its authentic pungent, mustard flavor.",
            hindiShortOverview = "অসমৰ প্ৰতিখন ঘৰৰ আটাইতকৈ প্ৰিয় আৰু পৰম্পৰাগত শাক। মাটিত লাই শাকত পোক আৰু বোকাময় সমস্যা বেছি হয়, কিন্তু হাইড্ৰ'পনিক্সত মাত্ৰ ৩০-৩৫ দিনত সম্পূৰ্ণ কীটনাশকমুক্ত, কোমল আৰু সুন্দৰ ঝাঁজযুক্ত লাই শাক প্ৰচুৰ পৰিমাণে উৎপাদন হয়।",
            ecMin = 1.4,
            ecMax = 2.0,
            ppm500Min = 700,
            ppm500Max = 1000,
            phMin = 5.8,
            phMax = 6.5,
            idealWaterTempMin = 18,
            idealWaterTempMax = 23,
            dayTempMin = 18,
            dayTempMax = 26,
            nightTempMin = 12,
            nightTempMax = 18,
            lightHoursPerDay = 12,
            recommendedDli = "13 - 16 mol/m²/day",
            recommendedSystems = listOf("NFT (Nutrient Film Technique)", "DWC Floating Raft", "Bamboo Stand Kratky"),
            hindiRecommendedSystems = listOf("NFT পাইপ পদ্ধতি", "DWC ওপঙা পদ্ধতি", "অসমৰ বাঁহৰ ক্ৰেটকি ষ্টেণ্ড"),
            germinationDays = "2 - 3 Days",
            harvestDaysFromSeed = "28 - 38 Days",
            plantSpacingCm = "18 - 22 cm",
            waterPerPlantDaily = "160 - 240 ml",
            seedlingGuide = CropStageGuide(
                stageName = "Seed Sowing & Rapid Sprouting",
                hindiStageName = "গুটি সিঁচা আৰু দ্ৰুত অংকুৰণ",
                durationDays = "8 - 12 Days",
                targetEc = "0.7 mS/cm",
                targetPh = "6.0",
                instructions = listOf(
                    "Sow 2 seeds per rockwool plug or cocopeat net cup at 3 mm depth.",
                    "Lai Xak germinates vigorously in 48-72 hours at 20-24°C.",
                    "Thin to the single strongest seedling per cup once first true leaves appear.",
                    "Provide 12-14 hours of sunlight or grow lights to prevent stem elongation."
                ),
                hindiInstructions = listOf(
                    "ৰকউল বা নাৰিকলৰ ছোবাত প্ৰতিটো কাপত ২ টাকৈ লাই শাকৰ গুটি ৩ মিমি গভীৰত দিয়ক।",
                    "অসমৰ জলবায়ুত মাত্ৰ ৪৮ ৰ পৰা ৭২ ঘণ্টাৰ ভিতৰত ইয়াৰ গজালি ওলাই পৰে।",
                    "প্ৰথম পাত ওলোৱাৰ পিছত প্ৰতিটো কাপত এটাই মাত্ৰ আটাইতকৈ শক্তিশালী পুলি ৰাখি বাকীটো আঁতৰাওক।",
                    "দৈনিক ১২-১৪ ঘণ্টা পোহৰ দিয়ক যাতে পুলি মজবুত হয়।"
                ),
                keyTips = listOf(
                    "Lai Xak is very vigorous and has one of the highest germination success rates (>95%).",
                    "Keep nursery tray evenly moist."
                ),
                hindiKeyTips = listOf(
                    "লাই শাকৰ গুটিৰ গজালি মেলাৰ ক্ষমতা ৯৫% তকৈও অধিক।",
                    "নাৰ্চাৰীত সদায় সমভাৱে আৰ্দ্ৰতা ৰাখক।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Broad Leaf Canopy Growth",
                hindiStageName = "বহল পাত আৰু জোপোহা বৃদ্ধি",
                durationDays = "18 - 26 Days",
                targetEc = "1.5 - 1.9 mS/cm",
                targetPh = "6.0 - 6.4",
                instructions = listOf(
                    "Move net pots into NFT channels or DWC rafts with 20 cm spacing.",
                    "Maintain EC around 1.6-1.8. Moderate sulfur in nutrient formula enhances authentic mustard pungency.",
                    "Ensure root zone has good oxygen flow (DO > 6.5 ppm).",
                    "Maintain cool root temperatures (below 24°C)."
                ),
                hindiInstructions = listOf(
                    "২০ চেমি দূৰত্বত নেট পটবোৰ NFT পাইপ বা DWC ত বহুৱাওক।",
                    "সাৰৰ EC মাত্ৰা ১.৬ ৰ পৰা ১.৮ ৰ ভিতৰত ৰাখক। সামান্য ছালফাৰে লাই শাকৰ ঐতিহ্যবাহী সোৱাদ আৰু ঝাঁজ বৃদ্ধি কৰে।",
                    "শিপাত যাতে প্ৰচুৰ অক্সিজেন চলাচল কৰে তাৰ বাবে এয়াৰ পাম্প চলাই ৰাখক।",
                    "পানীৰ উষ্ণতা ২৪ ডিগ্ৰীৰ তলত ৰাখিবলৈ চেষ্টা কৰক।"
                ),
                keyTips = listOf(
                    "Lai Xak consumes more water as leaf area expands rapidly after day 20.",
                    "Ensure reservoir level is monitored daily."
                ),
                hindiKeyTips = listOf(
                    "২০ দিনৰ পিছত লাই শাকৰ পাত বহল হৈ পৰে আৰু পানী বেছিকৈ টানে, গতিকে দৈনিক পানীৰ স্তৰ পৰীক্ষা কৰক।",
                    "বতাহ চলাচল থাকিলে পাতৰ ৰোগ নহয়।"
                )
            ),
            fruitingGuide = null,
            pollinationGuide = null,
            pruningGuide = PruningGuide(
                trellisingMethod = "Self-supporting broad rosette.",
                hindiTrellisingMethod = "কোনো সাৱলম্বী তাঁৰ নালাগে, পাত্ৰতে সুন্দৰকৈ মেল খাই বাঢ়ে।",
                suckeringRules = "None.",
                hindiSuckeringRules = "প্ৰয়োজন নাই।",
                leafPruning = "Harvest lower broad leaves continuously or harvest whole plant.",
                hindiLeafPruning = "তলৰ ডাঙৰ ডাঙৰ পাতবোৰ ছিঙি একেৰাহে কেইবাসপ্তাহো খাব পাৰি নাইবা গোটেই গছজোপা একেলগে কাটিব পাৰি।",
                toppingRule = "Harvest immediately before flower stalks shoot up in late winter.",
                hindiToppingRule = "মাজৰ পৰা ফুল ওলোৱাৰ লক্ষণ দেখাৰ লগে লগে কাটি চপাওক।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "10-15-32 + Calcium Nitrate + Magnesium Sulfate",
                floweringFruitingNpk = "N/A",
                partADetails = "Calcium Nitrate: 1.0 g/L",
                partBDetails = "Leafy Hydro NPK: 1.0 g/L",
                partCDetails = "Epsom Salt (MgSO4): 0.45 g/L",
                mixingGuide = "Dissolve Part B (NPK), add Part C (Epsom Salt), finish with Part A (Calcium Nitrate).",
                hindiMixingGuide = "১০০ লিটাৰ পানীত ১০০ গ্ৰাম NPK, ৪৫ গ্ৰাম এপচম চল্ট আৰু শেষত ১০০ গ্ৰাম কেলচিয়াম নাইট্ৰেট মিহলাওক।",
                flushSchedule = "Pure water flush 24 hours prior to harvest.",
                hindiFlushSchedule = "ফচল চপোৱাৰ ২৪ ঘণ্টা পূৰ্বে কেৱল বিশুদ্ধ পানী চলাই কোমল সোৱাদ লাভ কৰক।"
            ),
            harvestingGuide = "Harvest in the morning. Cut clean at base or snap mature outer leaves. Wash gently and pack for market.",
            hindiHarvestingGuide = "ৰাতিপুৱা শিপাৰ ওপৰত কাটি বা ডাঙৰ পাতবোৰ ছিঙি চপাওক। মাটি নথকাৰ বাবে ই অতি পৰিষ্কাৰ আৰু বজাৰত সাধাৰণ শাকতকৈ দুগুণ দামত বিক্ৰী হয়।",
            commonPestsAndDiseases = listOf(
                "Flea Beetles (Tiny black jumping beetles that make shot-holes in leaves; use physical mesh screening)",
                "Aphids (Spray neem oil at 3 ml/L)",
                "Downy Mildew (Prevent by spacing plants properly and ensuring good air movement)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "মাটিৰ পোক বা ফুটা কৰা পোক (হাইড্ৰ'পনিক্সত মহৰ জাল ব্যৱহাৰ কৰিলে একেবাৰেই নহয়)",
                "মোৱা পোক (৩ মিলি নিম তেল স্প্ৰে' কৰক)",
                "পাতত দাগ পৰা ৰোগ (বতাহ চলাচলৰ ব্যৱস্থা ৰাখক)"
            )
        )
    )
}
