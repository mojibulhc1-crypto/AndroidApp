package com.example.data.crops

import com.example.model.CropCategory
import com.example.model.CropStageGuide
import com.example.model.HydroponicCrop
import com.example.model.NutrientRecipe
import com.example.model.PollinationGuide
import com.example.model.PruningGuide

object FruitingCropsData {

    val crops: List<HydroponicCrop> = listOf(
        // ==================== 1. CUCUMBER (তিয়ঁহ) ====================
        HydroponicCrop(
            id = "cucumber",
            name = "Cucumber (English / Parthenocarpic)",
            hindiName = "তিয়ঁহ (ইংলিছ পাৰ্থেনোকাৰ্পিক তিয়ঁহ)",
            scientificName = "Cucumis sativus",
            category = CropCategory.FRUITING_CROP,
            iconEmoji = "🥒",
            shortOverview = "One of the most rewarding high-yield hydroponic crops. Thrives in Dutch Buckets and Bato buckets with high water uptake and rapid continuous fruit set.",
            hindiShortOverview = "হাইড্ৰ'পনিক্সত সৰ্বাধিক লাভজনক আৰু খৰতকীয়া ফলদায়ক পাচলি। পাৰ্থেনোকাৰ্পিক (Parthenocarpic) জাতত কোনো পুৰুষ ফুল বা পোকৰ পৰাগযোগ অবিহনেই প্ৰতিটো ফুলৰ পৰা তিয়ঁহ ওলায়। অসমৰ ডাট্চ বাকেট আৰু বাঁহৰ জাঁপত ইয়াৰ উৎপাদন অতি চমকপ্ৰদ।",
            ecMin = 1.7,
            ecMax = 2.5,
            ppm500Min = 850,
            ppm500Max = 1250,
            phMin = 5.5,
            phMax = 6.0,
            idealWaterTempMin = 19,
            idealWaterTempMax = 23,
            dayTempMin = 22,
            dayTempMax = 28,
            nightTempMin = 18,
            nightTempMax = 21,
            lightHoursPerDay = 14,
            recommendedDli = "20 - 30 mol/m²/day",
            recommendedSystems = listOf("Dutch Bucket (Bato Bucket)", "Drip Irrigation in Perlite/Cocopeat", "Deep Water Culture (Heavy Duty)"),
            hindiRecommendedSystems = listOf("ডাট্চ বাকেট পদ্ধতি (Dutch Bucket)", "কোকোপিট ড্ৰিপ ব্যৱস্থা", "গভীৰ পানীৰ DWC পদ্ধতি"),
            germinationDays = "2 - 4 Days",
            harvestDaysFromSeed = "45 - 55 Days",
            plantSpacingCm = "40 - 50 cm",
            waterPerPlantDaily = "1.5 - 3.0 Liters",
            seedlingGuide = CropStageGuide(
                stageName = "Fast Germination & Strong Rooting",
                hindiStageName = "দ্ৰুত অংকুৰণ আৰু শক্তিশালী শিপা",
                durationDays = "10 - 14 Days",
                targetEc = "1.0 - 1.2 mS/cm",
                targetPh = "5.8",
                instructions = listOf(
                    "Sow seeds 1 cm deep directly into presoaked rockwool cubes or cocopeat plugs at 24-27°C.",
                    "Cucumber seeds sprout within 48 hours in warm moist darkness.",
                    "Provide 14 hours of intense light immediately upon emergence to avoid tall flimsy stems.",
                    "Feed with mild vegetative nutrient solution (EC 1.0) when the first true leaf opens."
                ),
                hindiInstructions = listOf(
                    "ৰকউল বা নাৰিকলৰ ছোবাৰ প্লাগত ১ চেমি গভীৰতাত গুটি ৰুই ২৪-২৭ ডিগ্ৰী উষ্ণতাত আৰ্দ্ৰ কৰি ৰাখক।",
                    "উষ্ণ আৰু আৰ্দ্ৰ পৰিৱেশত মাত্ৰ ৪৮ ঘণ্টাৰ ভিতৰতে তিয়ঁহৰ গজালি ওলায়।",
                    "গজালি ওলোৱাৰ লগে লগে দৈনিক ১৪ ঘণ্টা উজ্জ্বল পোহৰ দিয়ক যাতে গছৰ কাণ্ড শক্তিশালী হয়।",
                    "প্ৰথম প্ৰকৃত পাত মেল খোৱাৰ লগে লগে পাতল সাৰ (EC 1.0) প্ৰয়োগ কৰক।"
                ),
                keyTips = listOf(
                    "Cucumber seedlings grow rapidly. Do not leave in small plugs beyond 14 days or roots become root-bound.",
                    "Always choose 100% gynoecious/parthenocarpic greenhouse varieties (e.g., Kian, Isatis, Mini Beit Alpha)."
                ),
                hindiKeyTips = listOf(
                    "তিয়ঁহৰ পুলি বৰ সোনকালে বাঢ়ে, গতিকে ১৪ দিনৰ ভিতৰতে মূল বাকেটলৈ স্থানান্তৰ কৰক।",
                    "হাইড্ৰ'পনিক্সৰ বাবে সদায় পাৰ্থেনোকাৰ্পিক (Parthenocarpic) হাইব্ৰিড জাতৰ বীজ নিৰ্বাচন কৰক, কাৰণ ইয়াত মাখি বা পোক নোহোৱাকৈয়ে প্ৰতিটো ফুলৰ পৰা ফল ওলায়।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Trellis Training & Vine Expansion",
                hindiStageName = "ট্ৰেলিচিং আৰু লতাক ওপৰলৈ উঠোৱা",
                durationDays = "15 - 22 Days",
                targetEc = "1.8 - 2.0 mS/cm",
                targetPh = "5.6 - 5.9",
                instructions = listOf(
                    "Transplant 1 seedling per 11-liter Dutch bucket filled with 70% perlite and 30% cocopeat or clay pebbles.",
                    "Clip main stem to an overhead trellis twine using tomato/cucumber clips, winding clockwise around twine.",
                    "Strip off ALL flowers, tendrils, and side lateral shoots on the lower 5 nodes (first 40-50 cm from base) to channel strength into root system.",
                    "Set drip timers to run 4-6 times per day during daylight hours."
                ),
                hindiInstructions = listOf(
                    "১১ লিটাৰ ডাট্চ বাকেটত (কোকোপিট আৰু পাৰ্লাইট মিশ্ৰণত) প্ৰতিটো বাকেটত এটাকৈ পুলি ৰোওক।",
                    "ওপৰৰ পৰা ওলমি থকা তাঁৰ বা ৰছীৰ সৈতে প্লাষ্টিক ক্লিপ লগাই লতাক ওপৰলৈ ঘড়ীৰ কাঁটাৰ দিশত মেৰিয়াই দিয়ক।",
                    "তলৰ প্ৰথম ৫ টা গাঁঠিৰ (৫০ চেমি উচ্চতালৈকে) সকলো ফুল, কাষৰ সৰু ডাল আৰু আঁকবোৰ কাটি পেলাওক। ইয়াৰ ফলত শিপা আৰু কাণ্ড অতি শক্তিশালী হৈ পৰিব।",
                    "দিনৰ ভাগত ড্ৰিপ পাম্পটো ৪-৬ বাৰকৈ চলাই শিপালৈ সাৰযুক্ত পানী যোগান দিয়ক।"
                ),
                keyTips = listOf(
                    "Never let fruit form on the bottom 5 nodes. Fruiting too early stunts the vine and halves total yield.",
                    "Support vine with roller hooks overhead for high-wire lowering system."
                ),
                hindiKeyTips = listOf(
                    "তলৰ ৫০ চেমিত ফল ধৰিব নিদিব। সোনকালে ফল ল'লে গছজোপাৰ বাঢ়ন থমকি ৰয় আৰু ভৱিষ্যতৰ উৎপাদন আধা হৈ পৰে।",
                    "বাঁহৰ কাঠামোৰে মজবুত জাঁপ সাজি ৰছী বান্ধক।"
                )
            ),
            fruitingGuide = CropStageGuide(
                stageName = "Continuous Heavy Fruiting Phase",
                hindiStageName = "ধাৰাবাহিক ফল ধৰা আৰু বৃদ্ধিৰ পৰ্যায়",
                durationDays = "30 - 60+ Days",
                targetEc = "2.2 - 2.4 mS/cm",
                targetPh = "5.6 - 5.8",
                instructions = listOf(
                    "Increase Potassium (K) and Calcium (Ca) in nutrient solution to sustain fast fruit swelling without hollow heart or blossom end yellowing.",
                    "Maintain drip delivery of 2.0 to 3.0 Liters per plant daily during peak harvest.",
                    "Allow 1 cucumber per leaf axil along the main stem; thin out multiple twin fruits per node to guarantee uniform straight cucumbers.",
                    "Ensure day temperatures do not exceed 32°C; use evaporative cooling misting or shade nets in Assam summer."
                ),
                hindiInstructions = listOf(
                    "ফল ডাঙৰ হোৱাৰ সময়ত সাৰত পটাছিয়াম (K) আৰু কেলচিয়াম (Ca) বৃদ্ধি কৰক যাতে তিয়ঁহবোৰ মাজত ফুটা নহয় আৰু আগ হালধীয়া নপৰে।",
                    "পূৰ্ণ উৎপাদনৰ সময়ত প্ৰতিজোপা গছে দৈনিক ২ ৰ পৰা ৩ লিটাৰ পৰ্যন্ত সাৰৰ পানী শোষণ কৰে।",
                    "প্ৰতিটো পাতৰ গাঁঠিত এটাকৈ মাত্ৰ নিৰোগী ফল ৰাখক, একে ঠাইতে দুটা ফল থাকিলে এটা চিঙি দিয়ক যাতে তিয়ঁহবোৰ পোন আৰু ডাঙৰ হয়।",
                    "অসমৰ গৰমত ছাঁ-জাল (Shade Net) ব্যৱহাৰ কৰি উষ্ণতা নিয়ন্ত্ৰণ কৰক।"
                ),
                keyTips = listOf(
                    "Harvest fruit while green and tender before seed coat hardens.",
                    "Crooked fruit is caused by low temperature (<17°C), low Calcium, or physical hindrance from leaves."
                ),
                hindiKeyTips = listOf(
                    "তিয়ঁহবোৰ কোমল আৰু গাঢ় সেউজীয়া হৈ থকা সময়তেই চপাব লাগে।",
                    "তিয়ঁহ বেকা হোৱাৰ কাৰণ হ'ল কেলচিয়ামৰ নাটনি বা পাতত লাগি থকাৰ ফলত হোৱা বাধা।"
                )
            ),
            pollinationGuide = PollinationGuide(
                isSelfPollinating = false,
                requiresManualPollinationIndoors = false, // Parthenocarpic does not need pollination
                flowerTypes = "Greenhouse parthenocarpic varieties are all-female (gynoecious). They produce seedless fruit without pollination.",
                hindiFlowerTypes = "হাইড্ৰ'পনিক পাৰ্থেনোকাৰ্পিক জাতৰ সকলো ফুলেই স্ত্ৰী ফুল। কোনো ধৰণৰ পৰাগযোগ নকৰাকৈয়ে এইবোৰৰ পৰা বীজহীন কোমল তিয়ঁহ উৎপাদন হয়।",
                handPollinationTechnique = "None required for parthenocarpic varieties! If using heirloom open-pollinated cucumbers: take a fine paintbrush, collect yellow dust from male flower center, and dab into female flower stigma (identified by the mini baby cucumber beneath petals).",
                hindiHandPollinationTechnique = "পাৰ্থেনোকাৰ্পিক জাতত কোনো পৰাগযোগৰ প্ৰয়োজন নাই! যদি দেশী জাত কৰা হয়, তেন্তে এটা তুলিকাৰে পুৰুষ ফুলৰ হালধীয়া ৰেণু আনি স্ত্ৰী ফুলৰ মাজত লগাই দিয়ক (স্ত্ৰী ফুলৰ তলত সৰু তিয়ঁহৰ গঠন স্পষ্টকৈ দেখা যায়)।",
                bestTimeToPollinate = "7:00 AM - 10:00 AM (if manual pollination needed)",
                optimalHumidityForPollen = "60% - 70% RH"
            ),
            pruningGuide = PruningGuide(
                trellisingMethod = "Single-stem high-wire vertical trellis with twine and stem clips.",
                hindiTrellisingMethod = "ওপৰৰ তাঁৰত ৰছী ওলোমাই ক্লিপৰ সহায়ত লতাক উলম্বভাৱে চিধাকৈ ওপৰলৈ উঠাওক।",
                suckeringRules = "Prune all lateral sucker shoots (side branches) at 5 cm length. Direct all vine energy into the single central stem.",
                hindiSuckeringRules = "কাষৰ পৰা ওলোৱা সকলো পাৰ্শ্ব শাখা (Suckers) ৫ চেমি হোৱাৰ লগে লগে কাটি পেলাওক। কেৱল এটা মূল কাণ্ডইহে ওপৰলৈ বাঢ়িব লাগে।",
                leafPruning = "Remove the bottom 3-4 oldest, yellowing leaves every week as the vine climbs higher. Keeps air circulating and stops powdery mildew.",
                hindiLeafPruning = "প্ৰতি সপ্তাহে তলৰ আটাইতকৈ পুৰণি আৰু হালধীয়া পৰা ৩-৪ খিলা পাত কাটি আঁতৰাওক। ইয়াৰ ফলত শিপাত পৰ্যাপ্ত বতাহ আৰু পোহৰ পৰে আৰু ভেঁকুৰ ৰোগ নহয়।",
                toppingRule = "When the vine reaches the top trellis wire (2.2 meters), pinch the main growing tip, or lower the vine down using a roller hook.",
                hindiToppingRule = "গছজোপাই ২.২ মিটাৰ উচ্চতাৰ তাঁৰ চুলে ওপৰৰ আগটো চিঙি দিয়ক নাইবা ৰছী তললৈ নমাই দিয়ক (Lean and lower method)।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "10-10-30 + Calcium Nitrate + Epsom Salt (EC 1.8)",
                floweringFruitingNpk = "8-12-34 (Heavy Potassium) + Calcium Nitrate + Magnesium Sulfate (EC 2.2 - 2.4)",
                partADetails = "Calcium Nitrate [Ca(NO3)2]: 1.2 g/L + Iron Chelate (Fe-DTPA): 0.04 g/L",
                partBDetails = "Masterblend / Tomato-Cucumber Formula (8-12-34) + Micronutrients: 1.2 g/L + Potassium Sulfate (0.2 g/L extra in heavy fruit load)",
                partCDetails = "Epsom Salt [MgSO4·7H2O]: 0.6 g/L",
                mixingGuide = "Step 1: Dissolve Part B in water tank. Step 2: Dissolve Part C. Step 3: Dissolve Part A in separate small bucket and pour in LAST while circulation pump runs. Target pH 5.6-5.8.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত প্ৰথমে ১২০ গ্ৰাম NPK (Part B) গুলক। তাৰ পিছত ৬০ গ্ৰাম এপচম চল্ট (Part C)। শেষত ১২০ গ্ৰাম কেলচিয়াম নাইট্ৰেট আৰু আইৰণ (Part A) মিহলাওক। pH ৫.৬ ৰ পৰা ৫.৮ ৰ ভিতৰত ৰাখক।",
                flushSchedule = "Flush media with plain pH 5.8 water every 14 days to clear excess salt build-up in perlite.",
                hindiFlushSchedule = "প্ৰতি ১৪ দিনৰ মূৰে মূৰে এবাৰ কেৱল পৰিষ্কাৰ পানী চলাই কোকোপিট আৰু পাৰ্লাইটৰ অতিৰিক্ত নিমখ চাফা কৰক।"
            ),
            harvestingGuide = "Harvest fruit every 48 hours with a sharp pair of bypass shears, leaving a 1 cm stem attached to the fruit. Harvesting frequently stimulates rapid new flower and fruit emergence.",
            hindiHarvestingGuide = "প্ৰতি ৪৮ ঘণ্টাৰ মূৰে মূৰে ধাৰাল কাচি বা কেঁচীৰে ১ চেমি ঠাৰি ৰাখি তিয়ঁহবোৰ কাটি লওক। যিমানে নিয়মীয়াকৈ চপাব, সিমানেই নতুন তিয়ঁহ ওলাই থাকিব।",
            commonPestsAndDiseases = listOf(
                "Powdery Mildew (White fungal talcum spots on top leaves; spray potassium bicarbonate or bio-fungicide Bacillus subtilis)",
                "Blossom End Yellowing (Due to sudden EC drop or Calcium deficiency; balance watering)",
                "Two-Spotted Spider Mites (Punctures leaves under dry heat; mist foliage and introduce Phytoseiulus persimilis predatory mites)",
                "Pythium Root Rot (Brown smelly roots; keep water below 22°C and use hydrogen peroxide or beneficial Trichoderma)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "পাউডাৰী মিলডিউ (পাতৰ ওপৰত বগা পাউদাৰৰ নিচিনা ভেঁকুৰ - পটাছিয়াম বাইকাৰ্বনেট বা জৈৱিক ভেঁকুৰনাশক স্প্ৰে' কৰক)",
                "তিয়ঁহৰ আগ হালধীয়া হৈ শুকাই যোৱা (কেলচিয়ামৰ নাটনি আৰু হঠাৎ EC পৰি যোৱাৰ বাবে হয়)",
                "ৰঙা মকৰা বা স্পাইডাৰ মাইট (পাতৰ তলত মিহি জাল বান্ধি ৰস শুহি খায় - নিম তেল স্প্ৰে' কৰক)",
                "শিপা পচা ৰোগ (পানী বেছি গৰম হ'লে শিপা নষ্ট হয় - পানীত ট্ৰাইক'ডাৰ্মা ব্যৱহাৰ কৰক)"
            )
        ),

        // ==================== 2. TOMATO (বিলাহী) ====================
        HydroponicCrop(
            id = "tomato",
            name = "Tomato (Vine & Cherry Indeterminate)",
            hindiName = "বিলাহী (হাইড্ৰ'পনিক ইনডিটাৰমিনেট আৰু চেৰী বিলাহী)",
            scientificName = "Solanum lycopersicum",
            category = CropCategory.FRUITING_CROP,
            iconEmoji = "🍅",
            shortOverview = "The gold standard of commercial hydroponics. Grows tall vines up to 10+ meters with single-truss string trellising, yielding sweet clusters continuously for 9+ months.",
            hindiShortOverview = "হাইড্ৰ'পনিক্সৰ আটাইতকৈ জনপ্ৰিয় আৰু সৰ্বাধিক উৎপাদনক্ষম শস্য। ইনডিটাৰমিনেট জাতৰ বিলাহী এডাল ৰছীত ওপৰলৈ ৮-১০ মিটাৰ পৰ্যন্ত বাঢ়ি যায় আৰু একেৰাহে ৮-১০ মাহলৈকে থোপাক-থোপে সুস্বাদু, ৰসাল বিলাহী দি থাকে।",
            ecMin = 2.0,
            ecMax = 3.5,
            ppm500Min = 1000,
            ppm500Max = 1750,
            phMin = 5.8,
            phMax = 6.4,
            idealWaterTempMin = 19,
            idealWaterTempMax = 23,
            dayTempMin = 21,
            dayTempMax = 27,
            nightTempMin = 16,
            nightTempMax = 19,
            lightHoursPerDay = 14,
            recommendedDli = "22 - 32 mol/m²/day",
            recommendedSystems = listOf("Dutch Buckets (Bato Buckets) with Drip", "Rockwool Slabs with Drip Stakes", "Gro-Bags with Perlite/Cocopeat"),
            hindiRecommendedSystems = listOf("ডাট্চ বাকেট ড্ৰিপ পদ্ধতি", "ৰকউল শ্লেব পদ্ধতি", "কোকোপিট গ্ৰ' বেগ"),
            germinationDays = "4 - 7 Days",
            harvestDaysFromSeed = "65 - 80 Days",
            plantSpacingCm = "40 - 50 cm",
            waterPerPlantDaily = "1.8 - 3.5 Liters",
            seedlingGuide = CropStageGuide(
                stageName = "Sowing, Emergence & True Leaf Hardening",
                hindiStageName = "গুটি সিঁচা আৰু পুলি সবলীকৰণ",
                durationDays = "14 - 18 Days",
                targetEc = "1.0 - 1.4 mS/cm",
                targetPh = "5.8",
                instructions = listOf(
                    "Sow tomato seeds 5 mm deep into rockwool cubes pre-buffered at pH 5.5.",
                    "Maintain germination dome at 24-26°C with 80% humidity until emergence in 4-6 days.",
                    "Provide immediate 14-16 hours light (PPFD 250 µmol/m²/s) to build thick, stout hypocotyls.",
                    "Bottom-soak nursery plugs with half-strength nutrient solution once true leaves appear."
                ),
                hindiInstructions = listOf(
                    "pH ৫.৫ পানীত তিওৱা ৰকউল কিউবত বিলাহীৰ গুটি ৫ মিমি গভীৰতাত ৰোওক।",
                    "২৪-২৬ ডিগ্ৰী উষ্ণতাত আৰ্দ্ৰতা ঢাকনিৰে ৰাখক, ৪-৬ দিনৰ ভিতৰত গজালি ওলাব।",
                    "গজালি ওলোৱাৰ লগে লগে দৈনিক ১৪-১৬ ঘণ্টা পোহৰ দিয়ক যাতে গছৰ কাণ্ড শকত আৰু মজবুত হয়।",
                    "প্ৰথম প্ৰকৃত পাত ওলোৱাৰ পিছত পাতল সাৰৰ পানীৰে তিয়াই ৰাখক।"
                ),
                keyTips = listOf(
                    "Tomato seedlings that receive insufficient light become leggy and fail later under heavy fruit load.",
                    "Keep nursery fan on low speed; mechanical air stimulation thickens plant stems by 40%."
                ),
                hindiKeyTips = listOf(
                    "পোহৰ কম পালে বিলাহীৰ পুলি ওখ আৰু দুৰ্বল হয়, যিয়ে পিছলৈ ফলৰ ওজন সহিব নোৱাৰে।",
                    "নাৰ্চাৰীত পাতল ফেন চলালে গছৰ কাণ্ড ৪০% বেছি ডাঠ আৰু শক্তিশালী হয়।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Main Stem Trellising & De-suckering",
                hindiStageName = "ট্ৰেলিচিং আৰু সাকাৰ্স (কাষৰ ডাল) কটা",
                durationDays = "20 - 30 Days",
                targetEc = "2.0 - 2.4 mS/cm",
                targetPh = "5.8 - 6.2",
                instructions = listOf(
                    "Plant in Dutch buckets filled with 3:1 perlite to cocopeat ratio.",
                    "Attach twine to base with a loose slip-knot or tomato clip.",
                    "De-sucker every 3 days: Snap off ALL sucker shoots emerging at the 45-degree angle between the main stem and leaf petioles when they are 2-5 cm long.",
                    "Maintain a single dominant stem ('leader')."
                ),
                hindiInstructions = listOf(
                    "ডাট্চ বাকেটত ৩ ভাগ পাৰ্লাইট আৰু ১ ভাগ কোকোপিটৰ মিশ্ৰণত পুলি ৰোওক।",
                    "তলৰ অংশত প্লাষ্টিক ক্লিপ লগাই ওপৰৰ তাঁৰলৈ ৰছীৰে মেৰিয়াই দিয়ক।",
                    "প্ৰতি ৩ দিনৰ মূৰে মূৰে সাকাৰ্স (Suckers) কাটোতক: মূল কাণ্ড আৰু পাতৰ মাজৰ ৪৫ ডিগ্ৰী কোণৰ পৰা ওলোৱা সকলো পাৰ্শ্ব ডাল ২-৫ চেমি হ'লেই ভাঙি পেলাওক।",
                    "কেৱল এটা মূল কাণ্ডকহে ওপৰলৈ বাঢ়িবলৈ দিয়ক।"
                ),
                keyTips = listOf(
                    "Never let suckers grow large; a single missed sucker robs 20% of fruit sizing energy.",
                    "Snap suckers sideways with dry fingers in the morning so wounds callus quickly."
                ),
                hindiKeyTips = listOf(
                    "কাষৰ সৰু ডালবোৰ ডাঙৰ হ'বলৈ নিদিব, অন্যথা ফল সৰু হৈ পৰে।",
                    "ৰাতিপুৱা শুকান হাতেৰে কাষৰ ডালবোৰ কাটিলে ঘাঁ সোনকালে শুকায়।"
                )
            ),
            fruitingGuide = CropStageGuide(
                stageName = "Fruit Trusses, Ripening & Potassium Boost",
                hindiStageName = "থোপা বিলাহী পকা আৰু পটাছিয়াম বৃদ্ধি",
                durationDays = "35 - 120+ Days",
                targetEc = "2.6 - 3.2 mS/cm",
                targetPh = "6.0 - 6.4",
                instructions = listOf(
                    "Shift formula to high Potassium (K:N ratio of 2:1) and ensure continuous Calcium availability to prevent Blossom End Rot.",
                    "Prune each flower cluster (truss) to 4-5 uniform fruits for beefsteak, or 12-16 for cherry varieties.",
                    "De-leaf the lower canopy: As the lowest truss ripens, cut off all leaves below that truss to maximize light, airflow, and sugar translocation.",
                    "Maintain night temperatures at 16-19°C for high sugar accumulation (Brix > 8° for cherry)."
                ),
                hindiInstructions = listOf(
                    "বিলাহী ডাঙৰ হোৱাৰ সময়ত পটাছিয়ামৰ অনুপাত দুগুণ কৰক আৰু কেলচিয়ামৰ যোগান অব্যাহত ৰাখক যাতে বিলাহীৰ তলফালে ক'লা পৰা বেমাৰ (Blossom End Rot) নহয়।",
                    "প্ৰতিটো থোপাত ৪-৫ টাকৈ ডাঙৰ বিলাহী ৰাখি বাকী সৰু ফুলবোৰ চিঙি দিয়ক (চেৰী বিলাহীৰ ক্ষেত্ৰত ১২-১৬ টা ৰাখক)।",
                    "তলৰ পুৰণি পাতবোৰ কাটি দিয়ক: তলৰ থোপাটো পকাৰ লগে লগে তাৰ তলত থকা সকলো পাত কাটি আঁতৰাওক যাতে পোহৰ আৰু বতাহ চলাচল সুচল হয়।",
                    "ৰাতিৰ উষ্ণতা ১৬-১৯ ডিগ্ৰীত ৰাখিলে বিলাহীৰ মিঠা সোৱাদ (Brix) বহুগুণে বাঢ়ি যায়।"
                ),
                keyTips = listOf(
                    "Blossom End Rot is 100% preventable: maintain steady Calcium (180-200 ppm) and avoid erratic dry-wet watering cycles.",
                    "Higher EC (up to 3.2 mS/cm) produces intensely flavorful, sweet gourmet tomatoes."
                ),
                hindiKeyTips = listOf(
                    "বিলাহীৰ তল ক'লা পৰা ৰোগ কেলচিয়াম আৰু সঠিক পানীৰ যোগানেৰে সম্পূৰ্ণৰূপে প্ৰতিৰোধ কৰিব পাৰি।",
                    "সাৰৰ EC মাত্ৰা ২.৮-৩.০ ৰাখিলে বিলাহীৰ সোৱাদ বজাৰৰ সাধাৰণ বিলাহীতকৈ বহু বেছি মিঠা আৰু ৰসাল হয়।"
                )
            ),
            pollinationGuide = PollinationGuide(
                isSelfPollinating = true,
                requiresManualPollinationIndoors = true,
                flowerTypes = "Hermaphroditic perfect flowers (contain both male anthers and female stigma inside the same flower cone).",
                hindiFlowerTypes = "উভলিংগী ফুল (একেটা ফুলৰ ভিতৰতেই পুৰুষ আৰু স্ত্ৰী উভয় অংগ সোমাই থাকে)।",
                handPollinationTechnique = "Method 1: Tap the overhead trellis twine sharply with a stick between 10 AM and 2 PM to vibrate whole clusters. Method 2: Touch the back of each flower truss with an electric toothbrush or battery pollinator for 1 second. Yellow pollen clouds will drop onto stigma.",
                hindiHandPollinationTechnique = "পদ্ধতি ১: ৰাতিপুৱা ১০ বজাৰ পৰা দুপৰীয়া ২ বজাৰ ভিতৰত ওপৰৰ তাঁৰ বা ৰছীত লাঠিৰে মৃদু আঘাত কৰক, যাৰ কম্পনত ফুলবোৰ কঁপি পৰাগযোগ সম্পূৰ্ণ হ'ব। পদ্ধতি ২: এটা পুৰণি বেটাৰীযুক্ত টুথব্ৰাছ ফুলৰ থোপাত ১ ছেকেণ্ড লগাই কঁপাই দিয়ক; লগে লগে হালধীয়া ৰেণু উৰি পৰাগযোগ ঘটাব।",
                bestTimeToPollinate = "10:30 AM - 1:30 PM (When flowers are dry and pollen dehisces freely)",
                optimalHumidityForPollen = "60% - 70% RH (Below 50% pollen dries out; above 80% pollen sticks and fails to shed)"
            ),
            pruningGuide = PruningGuide(
                trellisingMethod = "Single leader vine on spool roller hook twine. Vine can grow 10+ meters by lowering and leaning horizontally along the row.",
                hindiTrellisingMethod = "ৰছী আৰু ৰুলাৰ হুকৰ সহায়ত এডাল কাণ্ডক ওপৰলৈ উঠাওক। গছজোপা ডাঙৰ হ'লে ৰছী খুলি তললৈ নমাই ১০ মিটাৰ পৰ্যন্ত দীঘল কৰিব পাৰি (Lean and lower system)।",
                suckeringRules = "Strict rule: Snap all side shoot suckers weekly. Never let suckers develop flowers.",
                hindiSuckeringRules = "কঠোৰ নিয়ম: প্ৰতি সপ্তাহে কাষৰ সকলো অপ্ৰয়োজনীয় শাখা (Suckers) কাটি পেলাওক। কাষৰ ডালে ফুল ধৰিব নাপায়।",
                leafPruning = "Maintain 16-18 active top leaves per plant. Strip bottom 3-4 leaves every 7 days as lower trusses ripen.",
                hindiLeafPruning = "প্ৰতিজোপা গছত ওপৰৰ ১৬-১৮ খিলা সতেজ পাত ৰাখক। তলৰ বিলাহী পকিলে তলৰ ৩-৪ খিলা পুৰণি পাত কাটি পেলাওক।",
                toppingRule = "Top the main vine terminal growing point 6 weeks before planned end of season to channel all remaining sugars into final trusses.",
                hindiToppingRule = "খেতি শেষ কৰাৰ ৬ সপ্তাহ পূৰ্বে ওপৰৰ মূল আগটো কাটি দিয়ক (Topping), যাতে বাকী সকলো শক্তি শেষৰ বিলাহীকেইটা পকোৱাত ব্যৱহাৰ হয়।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "10-15-30 + Calcium Nitrate (EC 2.0)",
                floweringFruitingNpk = "5-11-26 (Bloom) or 8-15-36 + Calcium Nitrate + Epsom Salt + Potassium Sulfate (EC 2.6 - 3.2)",
                partADetails = "Calcium Nitrate: 1.3 g/L + Iron Chelate (Fe-DTPA): 0.05 g/L",
                partBDetails = "Tomato Hydro NPK (5-11-26 or 8-15-36): 1.3 g/L + Micronutrients (Boron, Zinc, Manganese, Copper, Moly)",
                partCDetails = "Epsom Salt (MgSO4): 0.65 g/L",
                mixingGuide = "Dissolve Part B and Part C in master reservoir. Add Part A strictly in diluted water under continuous agitation. Monitor EC daily.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত ১৩০ গ্ৰাম NPK (Part B) আৰু ৬৫ গ্ৰাম এপচম চল্ট (Part C) গুলক। তাৰ পিছত ১৩০ গ্ৰাম কেলচিয়াম নাইট্ৰেট আৰু আইৰণ (Part A) সম্পূৰ্ণ মিহলাওক। EC ২.৮ আৰু pH ৬.০-৬.২ বজাই ৰাখক।",
                flushSchedule = "Run pure pH-balanced water for 12 hours once every 3 weeks to prevent sodium accumulation in root zone.",
                hindiFlushSchedule = "প্ৰতি ৩ সপ্তাহত এবাৰ বিশুদ্ধ পানীৰে ফ্ল্যাশ কৰক।"
            ),
            harvestingGuide = "Harvest at breaker stage (first orange-red blush) for maximum shelf life, or full vine-ripe for farmers' market / direct consumption. Twist gently upward until abscission knuckle snaps cleanly.",
            hindiHarvestingGuide = "বিলাহীৰ ৰং সামান্য ৰঙা হোৱাৰ লগে লগে চপাব পাৰে বা গছতে সম্পূৰ্ণ পকিব দিব পাৰে। ঠাৰিৰ গাঁঠিত আঙুলিৰে সামান্য ওপৰলৈ মোচৰ দিলে বিলাহীটো ধুনীয়াকৈ চিঙি আহে।",
            commonPestsAndDiseases = listOf(
                "Blossom End Rot (Black sunken leather spot on fruit bottom caused by localized Calcium deficiency under high transpiration)",
                "Early Blight / Alternaria (Concentric brown target rings on lower leaves; prune lower leaves and increase airflow)",
                "Whiteflies (Tiny white sap suckers; hang yellow sticky cards and spray neem or introduce Encarsia formosa wasps)",
                "Catfacing (Deformed puckered fruit caused by night temperatures below 14°C during flower initiation)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "বিলাহীৰ তল ক'লা পৰা ৰোগ (Blossom End Rot - কেলচিয়ামৰ নাটনিৰ বাবে হয়; কেলচিয়াম নাইট্ৰেট সঠিক মাত্ৰাত দিয়ক)",
                "পাতৰ আগতীয়া দাগ ৰোগ (Early Blight - তলৰ পুৰণি পাত কাটি পৰিষ্কাৰ ৰাখক)",
                "বগা মাখি বা হোৱাইট ফ্লাই (ৰস শুহি খোৱা সৰু বগা মাখি - হালধীয়া আঠাযুক্ত কাৰ্ড আৰু নিম তেল ব্যৱহাৰ কৰক)",
                "ফলৰ বিকৃতি বা কেটফেচিং (ফুল ফুলাৰ সময়ত ৰাতিৰ উষ্ণতা ১৪ ডিগ্ৰীতকৈ কমি গ'লে হয়)"
            )
        ),

        // ==================== 3. CAPSICUM / BELL PEPPER (ক্যাপচিকাম) ====================
        HydroponicCrop(
            id = "capsicum",
            name = "Capsicum / Bell Pepper (Red, Yellow & Green)",
            hindiName = "ক্যাপচিকাম / মিঠা জলকীয়া (Capsicum)",
            scientificName = "Capsicum annuum var. grossum",
            category = CropCategory.FRUITING_CROP,
            iconEmoji = "🫑",
            shortOverview = "Extremely lucrative high-value crop. Blocky thick-walled peppers demand stable warm temperatures and disciplined branch training. Hydroponic bell peppers yield 3-4x more than soil.",
            hindiShortOverview = "হাইড্ৰ'পনিক্সৰ অতি লাভজনক উচ্চ মূল্যৰ ফচল। ডাঠ আৰু ৰসাল ৰঙা, হালধীয়া আৰু সেউজীয়া ক্যাপচিকামৰ বাবে স্থিৰ উষ্ণতা আৰু উপযুক্ত ডাল কটাৰ প্ৰয়োজন। মাটিতকৈ হাইড্ৰ'পনিক্সত ইয়াৰ উৎপাদন ৩-৪ গুণ অধিক হয় আৰু বজাৰত সদায় উচ্চ দৰ পোৱা যায়।",
            ecMin = 1.8,
            ecMax = 2.6,
            ppm500Min = 900,
            ppm500Max = 1300,
            phMin = 5.8,
            phMax = 6.3,
            idealWaterTempMin = 20,
            idealWaterTempMax = 23,
            dayTempMin = 22,
            dayTempMax = 27,
            nightTempMin = 17,
            nightTempMax = 20,
            lightHoursPerDay = 14,
            recommendedDli = "20 - 28 mol/m²/day",
            recommendedSystems = listOf("Dutch Bucket (Bato Bucket)", "Cocopeat/Perlite Slab Drip", "Drip Containers"),
            hindiRecommendedSystems = listOf("ডাট্চ বাকেট পদ্ধতি", "কোকোপিট শ্লেব ড্ৰিপ ব্যৱস্থা", "ড্ৰিপ কন্টেইনাৰ"),
            germinationDays = "6 - 12 Days",
            harvestDaysFromSeed = "75 - 95 Days (Green: 75d, Red/Yellow: 95d)",
            plantSpacingCm = "35 - 45 cm",
            waterPerPlantDaily = "1.5 - 2.5 Liters",
            seedlingGuide = CropStageGuide(
                stageName = "Slow Warm Germination & Sturdy Growth",
                hindiStageName = "উষ্ণ অংকুৰণ আৰু সবল পুলি প্ৰস্তুত",
                durationDays = "18 - 24 Days",
                targetEc = "1.0 - 1.2 mS/cm",
                targetPh = "5.8",
                instructions = listOf(
                    "Maintain seed starting tray at 25-28°C on bottom heat mat; capsicum seeds are notoriously slow and erratic below 22°C.",
                    "Keep rockwool plugs evenly moist with pH 5.8 water.",
                    "Once sprouted, provide 14 hours light (PPFD 200 µmol/m²/s) and reduce ambient temperature slightly to 23°C to encourage stout growth."
                ),
                hindiInstructions = listOf(
                    "নাৰ্চাৰীৰ উষ্ণতা ২৫-২৮ ডিগ্ৰীত ৰাখক; ২২ ডিগ্ৰীৰ তলত ক্যাপচিকামৰ গুটি গজালি মেলাত বহুত পলম হয়।",
                    "ৰকউল প্লাগবোৰ pH ৫.৮ পানীত সমভাৱে সেমেকা কৰি ৰাখক।",
                    "গজালি ওলোৱাৰ পিছত দৈনিক ১৪ ঘণ্টা পোহৰ দিয়ক যাতে পুলি ডাঠ আৰু মজবুত হয়।"
                ),
                keyTips = listOf(
                    "Patience is vital: pepper seeds can take up to 10-12 days to pop.",
                    "Never let nursery media dry out during the germination window."
                ),
                hindiKeyTips = listOf(
                    "ধৈৰ্য্য ধৰক: ক্যাপচিকামৰ গুটি ওলাবলৈ ১০-১২ দিন পৰ্যন্ত সময় ল'ব পাৰে।",
                    "গজালি নোলোৱালৈকে শুকাবলৈ নিদিব।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "The 'Y' Fork & Crown Flower Pinching",
                hindiStageName = "'Y' আকাৰৰ ডাল বিভাজন আৰু প্ৰথম ফুল চিঙা",
                durationDays = "25 - 35 Days",
                targetEc = "1.8 - 2.2 mS/cm",
                targetPh = "5.8 - 6.2",
                instructions = listOf(
                    "Transplant 1 plant per Dutch bucket with 70% perlite / 30% cocopeat.",
                    "At 30-40 cm tall, the pepper naturally splits into two main branches (the 'Y' fork) with a single central flower bud (Crown Flower).",
                    "CRITICAL STEP: PINCH OFF THE CROWN FLOWER! Leaving the first flower on stunts plant growth and limits total yield by 50%.",
                    "Tie strings to each of the 2 primary stems to form a V-shaped two-leader canopy framework."
                ),
                hindiInstructions = listOf(
                    "ডাট্চ বাকেটত এটাকৈ পুলি কোকোপিট আৰু পাৰ্লাইটৰ মিশ্ৰণত ৰোওক।",
                    "গছজোপাই ৩০-৪০ চেমি উচ্চতা পালে প্ৰাকৃতিকভাৱেই ইংৰাজী 'Y' আখৰৰ দৰে দুটা মূল ডালত বিভক্ত হয় আৰু মাজত এটা প্ৰথম ফুল ওলায় (Crown Flower)।",
                    "অতি গুৰুত্বপূৰ্ণ নিয়ম: প্ৰথম ফুলটো (Crown Flower) হাতৰ নখেৰে লগে লগে চিঙি পেলাওক! এই প্ৰথম ফুলটো থাকিবলৈ দিলে গছৰ বাঢ়ন থমকি ৰয় আৰু ভৱিষ্যতৰ ফল আধা হৈ পৰে।",
                    "বিভক্ত হোৱা দুয়োডাল মূল ডালক দুডাল পৃথক ৰছীৰে 'V' আকাৰত ওপৰলৈ বান্ধি তোলক।"
                ),
                keyTips = listOf(
                    "Pinching the crown flower redirects immense energy into forming 4-6 heavy subsequent fruiting branches.",
                    "Support both leaders with string clips every 20 cm."
                ),
                hindiKeyTips = listOf(
                    "প্ৰথম ফুলটো চিঙিলে গছজোপাই পিছত প্ৰচুৰ পৰিমাণে ডাঙৰ ডাঙৰ ক্যাপচিকাম ধৰাৰ শক্তি লাভ কৰে।",
                    "দুয়োডাল ডালক ৰছীৰে সুৰক্ষিতভাৱে বান্ধি ৰাখক।"
                )
            ),
            fruitingGuide = CropStageGuide(
                stageName = "Fruit Swelling & Color Maturation",
                hindiStageName = "ফলৰ বৃদ্ধি আৰু ৰং পৰিৱৰ্তন",
                durationDays = "35 - 60+ Days",
                targetEc = "2.2 - 2.6 mS/cm",
                targetPh = "6.0 - 6.3",
                instructions = listOf(
                    "Increase Potassium and Calcium levels. Pepper walls require massive Calcium transport during cell expansion.",
                    "Avoid drastic swings in humidity to prevent Blossom End Rot and fruit cracking.",
                    "Harvest green fruit early for higher overall number of peppers, or wait 18-24 additional days on vine for full deep red/yellow color and maximum market premium."
                ),
                hindiInstructions = listOf(
                    "সাৰত কেলচিয়াম আৰু পটাছিয়ামৰ মাত্ৰা বঢ়াওক যাতে ক্যাপচিকামৰ আৱৰণ ডাঠ আৰু চকচকীয়া হয়।",
                    "আৰ্দ্ৰতা হঠাতে উঠা-নমা হ'বলৈ নিদিব যাতে ফল ফাটি নাযায় বা তল ক'লা নপৰে।",
                    "সেউজীয়া অৱস্থাত সোনকালে কাটিলে গছত বেছিকৈ ফল ওলায়, কিন্তু ৰঙা বা হালধীয়া ৰঙলৈ বাট চালে বজাৰত প্ৰতি কেজিত দুগুণ-তিনিগুণ অধিক মূল্য পোৱা যায়।"
                ),
                keyTips = listOf(
                    "Colored peppers (Red/Yellow/Orange) have 3x more Vitamin C and fetch twice the price of green peppers.",
                    "Maintain stable root zone temperature (20-22°C)."
                ),
                hindiKeyTips = listOf(
                    "ৰঙা আৰু হালধীয়া ক্যাপচিকামত ভিটামিন-চি প্ৰচুৰ থাকে আৰু বজাৰত ইয়াৰ চাহিদা আৰু দাম অতি বেছি।",
                    "শিপাৰ উষ্ণতা ২০-২২ ডিগ্ৰীত ৰাখক।"
                )
            ),
            pollinationGuide = PollinationGuide(
                isSelfPollinating = true,
                requiresManualPollinationIndoors = true,
                flowerTypes = "Hermaphroditic, nodding downward-facing white flowers with purple anthers.",
                hindiFlowerTypes = "উভলিংগী ফুল, বগা ৰঙৰ ফুলবোৰ তললৈ হালি থাকে।",
                handPollinationTechnique = "Gently shake or tap the trellis string daily between 11 AM and 2 PM. Alternatively, vibrate the back of flower stems with a small vibrating wand or brush. Airflow from circulation fans also triggers reliable pollination.",
                hindiHandPollinationTechnique = "দুপৰীয়া ১১ বজাৰ পৰা ২ বজাৰ ভিতৰত ৰছীবোৰ হাত বা লাঠিৰে মৃদুভাৱে কঁপাই দিয়ক। ফেনৰ মৃদু বতাহেও সুন্দৰকৈ পৰাগযোগ ঘটায়।",
                bestTimeToPollinate = "11:00 AM - 2:00 PM",
                optimalHumidityForPollen = "60% - 70% RH"
            ),
            pruningGuide = PruningGuide(
                trellisingMethod = "Two-leader or four-leader V-trellis system tied to overhead wires.",
                hindiTrellisingMethod = "দুটা বা চাৰিটা মূল ডালৰ 'V' পদ্ধতিৰে ওপৰৰ তাঁৰত বান্ধি দিয়ক।",
                suckeringRules = "Prune inward-facing side shoots on each branch. Keep the center of the canopy open for light and air penetration.",
                hindiSuckeringRules = "ভিতৰৰ ফালে বাঢ়ি অহা পাৰ্শ্ব ডালবোৰ কাটি পেলাওক যাতে মাজৰ ভাগত পোহৰ আৰু বতাহ সহজে সোমাব পাৰে।",
                leafPruning = "Remove any lower leaves touching the reservoir or growing media.",
                hindiLeafPruning = "তলৰ পুৰণি আৰু তল চুই থকা পাতবোৰ কাটি পেলাওক।",
                toppingRule = "Pinch the growing tips of all leaders 4 weeks before final planned harvest date.",
                hindiToppingRule = "খেতি সমাপ্ত কৰাৰ এমাহ আগতে ডালবোৰৰ ওপৰৰ আগটো চিঙি দিয়ক।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "10-10-30 + Calcium Nitrate (EC 1.8)",
                floweringFruitingNpk = "8-15-36 (Pepper formula) + Calcium Nitrate + Magnesium Sulfate (EC 2.2 - 2.6)",
                partADetails = "Calcium Nitrate: 1.1 g/L + Chelated Iron: 0.04 g/L",
                partBDetails = "Pepper Hydro NPK (8-15-36): 1.1 g/L",
                partCDetails = "Epsom Salt (MgSO4): 0.55 g/L",
                mixingGuide = "Mix Part B and Part C in main reservoir, followed by fully dissolved Part A last. Maintain pH 5.8-6.2.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত ১১০ গ্ৰাম NPK (Part B), ৫৫ গ্ৰাম এপচম চল্ট (Part C) আৰু শেষত ১১০ গ্ৰাম কেলচিয়াম নাইট্ৰেট (Part A) মিহলাওক। pH ৫.৮ ৰ পৰা ৬.২ ৰ ভিতৰত ৰাখক।",
                flushSchedule = "Clear flush with fresh water every 14 days.",
                hindiFlushSchedule = "প্ৰতি ১৪ দিনত এবাৰ বিশুদ্ধ পানীৰে চলাই শিপাৰ স্বাস্থ্য ভালে ৰাখক।"
            ),
            harvestingGuide = "Cut peppers with sharp pruning shears, leaving 2 cm of green calyx stem attached. Do not yank or pull by hand to avoid tearing the delicate branches.",
            hindiHarvestingGuide = "কেঁচীৰে ঠাৰিৰ ২ চেমি অংশ ৰাখি কাটি লওক। হাতেৰে টানি নিছিঙিব কাৰণ ক্যাপচিকামৰ ডালবোৰ সহজে মচক খাই ভাঙি যায়।",
            commonPestsAndDiseases = listOf(
                "Blossom End Rot (Black flattened patch on pepper tips; ensure steady Calcium delivery and steady transpiration)",
                "Thrips & Broad Mites (Causes leaf curling and bronzing; spray neem oil or predatory mites Amblyseius swirskii)",
                "Aphids (Cluster in young tender leaf tips; wash with insecticidal soap)",
                "Sunscald (White bleached paper patch on fruit shoulder exposed to intense direct summer sun; protect with leaf canopy or shade net)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "ক্যাপচিকামৰ তল ক'লা পৰা ৰোগ (কেলচিয়ামৰ নাটনিৰ বাবে হয়)",
                "থ্ৰিপছ আৰু মাইটছ (পাত কোঁচ খাই যোৱা পোক - নিম তেল স্প্ৰে' কৰক)",
                "মোৱা পোক (কোমল আগত আক্ৰমণ কৰে - নিম তেল স্প্ৰে' কৰক)",
                "ৰ'দত পোৰা বা চানস্কাল্ড (প্ৰখৰ ৰ'দত ক্যাপচিকামৰ গাত বগা শুকান দাগ পৰে - ছাঁ-জাল ব্যৱহাৰ কৰক)"
            )
        ),

        // ==================== 4. CHILLI & ASSAM BHUT JOLOKIA (জলকীয়া আৰু ভোট জলকীয়া) ====================
        HydroponicCrop(
            id = "chilli",
            name = "Chilli & Assam Bhut Jolokia (Ghost Pepper)",
            hindiName = "কেঁচা জলকীয়া আৰু অসমৰ বিশ্ববিখ্যাত ভোট জলকীয়া",
            scientificName = "Capsicum annuum / Capsicum chinense (Bhut Jolokia)",
            category = CropCategory.FRUITING_CROP,
            iconEmoji = "🌶️",
            shortOverview = "Chilli is an absolute daily staple across India. Hydroponic cultivation of Green Chilli and Assam's legendary indigenous Bhut Jolokia produces astronomical yields with scorching capsaicin heat (>1,000,000 SHU).",
            hindiShortOverview = "অসম আৰু সমগ্ৰ দেশৰ প্ৰতিখন খাদ্যৰ অবিচ্ছেদ্য অংগ। সাধাৰণ কেঁচা জলকীয়াৰ উপৰিও অসমৰ গৌৰৱ বিশ্ববিখ্যাত 'ভোট জলকীয়া' (Bhut Jolokia) হাইড্ৰ'পনিক্সত মাটিৰ তুলনাত দুগুণ বেগেৰে বাঢ়ে, ৰোগ-পোকমুক্ত হয় আৰু ইয়াৰ তীব্ৰ জ্বলা গুণ (>১০ লাখ Scoville Units) অক্ষুণ্ণ থাকে।",
            ecMin = 1.8,
            ecMax = 2.8,
            ppm500Min = 900,
            ppm500Max = 1400,
            phMin = 5.8,
            phMax = 6.4,
            idealWaterTempMin = 20,
            idealWaterTempMax = 24,
            dayTempMin = 24,
            dayTempMax = 30,
            nightTempMin = 18,
            nightTempMax = 22,
            lightHoursPerDay = 14,
            recommendedDli = "18 - 25 mol/m²/day",
            recommendedSystems = listOf("Dutch Bucket (Bato Bucket)", "Drip Irrigation in Cocopeat/Perlite", "Deep Water Culture (DWC)"),
            hindiRecommendedSystems = listOf("ডাট্চ বাকেট পদ্ধতি", "কোকোপিট ড্ৰিপ কন্টেইনাৰ", "DWC বাকেট পদ্ধতি"),
            germinationDays = "7 - 15 Days (Bhut Jolokia takes 10-21 days)",
            harvestDaysFromSeed = "75 - 105 Days",
            plantSpacingCm = "40 - 50 cm",
            waterPerPlantDaily = "1.2 - 2.2 Liters",
            seedlingGuide = CropStageGuide(
                stageName = "Warm Seed Stratification & Sprouting",
                hindiStageName = "উষ্ণ পৰিৱেশত অংকুৰণ আৰু নাৰ্চাৰী",
                durationDays = "18 - 25 Days",
                targetEc = "1.0 - 1.2 mS/cm",
                targetPh = "6.0",
                instructions = listOf(
                    "Soak Bhut Jolokia / chilli seeds in warm water (30°C) with a pinch of seaweed extract for 12 hours.",
                    "Sow seeds 5 mm deep in rockwool or cocopeat plugs. Maintain germination heat mat strictly at 26-30°C.",
                    "Bhut Jolokia (Capsicum chinense) is notoriously slow to germinate and requires 10-21 days of warm, steady moisture.",
                    "Provide 14 hours grow light once sprouts emerge; do not overwater."
                ),
                hindiInstructions = listOf(
                    "ভোট জলকীয়া বা সাধাৰণ জলকীয়াৰ গুটিবোৰ কুহুমীয়া পানীত ১২ ঘণ্টা তিয়াই ৰাখক।",
                    "ৰকউল বা নাৰিকলৰ ছোবাত ৫ মিমি গভীৰতাত গুটি দিয়ক। মনত ৰাখিব, ভোট জলকীয়া গজালি মেলাৰ বাবে ২৬-৩০ ডিগ্ৰী উষ্ণতা আৰু ১০-২১ দিন পৰ্যন্ত সময়ৰ প্ৰয়োজন হয়।",
                    "গজালি ওলোৱাৰ লগে লগে দৈনিক ১৪ ঘণ্টা পোহৰ দিয়ক।",
                    "নাৰ্চাৰীত বেছি পানী জমা হ'বলৈ নিদিব।"
                ),
                keyTips = listOf(
                    "Cold soil (<20°C) will rot Bhut Jolokia seeds. Keep them toasty warm.",
                    "Bhut Jolokia seedlings should be handled gently with gloves."
                ),
                hindiKeyTips = listOf(
                    "ঠাণ্ডাত ভোট জলকীয়াৰ গুটি পচি যায়, গতিকে নাৰ্চাৰী সদায় গৰম ঠাইত ৰাখক।",
                    "পুলি ওলোৱাৰ সময়ত সমান আৰ্দ্ৰতা বজাই ৰাখক।"
                )
            ),
            vegetativeGuide = CropStageGuide(
                stageName = "Main Stem Topping & Massive Bushing",
                hindiStageName = "ওপৰৰ আগ কটা (Topping) আৰু জোপোহা নিৰ্মাণ",
                durationDays = "25 - 35 Days",
                targetEc = "1.8 - 2.2 mS/cm",
                targetPh = "5.8 - 6.2",
                instructions = listOf(
                    "Transplant 1 plant per 11L Dutch bucket with 70% perlite and 30% cocopeat.",
                    "TOPPING TECHNIQUE: When seedling reaches 15-20 cm height with 6-8 true leaves, SNIP OFF THE APICAL GROWING TIP.",
                    "Topping triggers 4-8 vigorous lateral branches to explode from lower leaf nodes, transforming a skinny plant into a massive umbrella-shaped bush.",
                    "Stake the plant using bamboo sticks or twine trellis to bear heavy future yields."
                ),
                hindiInstructions = listOf(
                    "১১ লিটাৰ ডাট্চ বাকেটত কোকোপিট আৰু পাৰ্লাইটৰ মিশ্ৰণত পুলি ৰোওক।",
                    "আগ কটাৰ নিয়ম (Topping Technique): পুলিটো ১৫-২০ চেমি ওখ হ'লে আৰু ৬-৮ খিলা পাত ওলালে ওপৰৰ আগটো নখেৰে বা কেঁচীৰে কাটি পেলাওক।",
                    "আগ কাটি দিলে কাষৰ গাঁঠিবোৰৰ পৰা ৪-৮ ডালকৈ নতুন শক্তিশালী শাখা ওলাই পৰে আৰু গছজোপা এজোপা জোপোহা ছাতিৰ দৰে বহল হৈ পৰে।",
                    "অসমৰ জাতি বাঁহৰ সৰু কামি বা ৰছীৰে গছজোপাক চাৰিওফালৰ পৰা বান্ধি সহায় কৰক যাতে বতাহ আৰু ফলৰ ভৰত বাগৰি নপৰে।"
                ),
                keyTips = listOf(
                    "Topping increases final chilli yield by 200-300% compared to an untopped single stem.",
                    "Ensure adequate Nitrogen during this bushy expansion phase."
                ),
                hindiKeyTips = listOf(
                    "আগ চিঙি দিলে জলকীয়া আৰু ভোট জলকীয়াৰ উৎপাদন ২০০% ৰ পৰা ৩০০% পৰ্যন্ত বৃদ্ধি পায়।",
                    "জোপোহা হোৱাৰ সময়ত নাইট্ৰ'জেন আৰু পানীৰ যোগান সঠিক ৰাখক।"
                )
            ),
            fruitingGuide = CropStageGuide(
                stageName = "Prolific Flowering, Heat & Capsaicin Boost",
                hindiStageName = "প্ৰচুৰ ফুল, ফল আৰু তীব্ৰ জ্বলা গুণ বৃদ্ধি",
                durationDays = "35 - 90+ Days",
                targetEc = "2.2 - 2.6 mS/cm",
                targetPh = "6.0 - 6.4",
                instructions = listOf(
                    "Switch to high Potassium & Phosphorus flowering nutrient recipe to sustain hundreds of small white flowers.",
                    "Do NOT over-feed Nitrogen; excessive Nitrogen causes flower drop and lush leaves with zero fruit.",
                    "CAPSAICIN HEAT BOOST TRICK: For maximum pungency in Bhut Jolokia, introduce mild controlled water interval stress during ripening (let media dry slightly between drip cycles). This triggers the plant's natural defense mechanism, surging capsaicin levels past 1,000,000 Scoville Heat Units!",
                    "Harvest Green chillies regularly or let Bhut Jolokia turn deep fiery scarlet red."
                ),
                hindiInstructions = listOf(
                    "ফুল আৰু ফল ধৰাৰ সময়ত সাৰত পটাছিয়াম আৰু ফছফৰাছৰ মাত্ৰা বৃদ্ধি কৰক যাতে শ শ ফুল শুকাই নপৰে।",
                    "এই সময়ত নাইট্ৰ'জেন বেছি নিদিব, কাৰণ নাইট্ৰ'জেন বেছি হ'লে কেৱল পাতেই হ'ব আৰু ফুল সৰি পৰিব।",
                    "ভোট জলকীয়াৰ তীব্ৰ জ্বলা গুণ বঢ়োৱাৰ গোপন কৌশল: জলকীয়া পকাৰ সময়ত ড্ৰিপ পানীৰ অন্তৰাল সামান্য বঢ়াই দিয়ক (সামান্য পানীৰ টান পোৱা অৱস্থা)। এই নিয়ন্ত্ৰিত তাগিদাৰ ফলত গছজোপাই আত্মৰক্ষাৰ বাবে কেপচাইচিন (Capsaicin) ৰ উৎপাদন দুগুণ বঢ়াই তোলে আৰু ইয়াৰ জ্বলা ১০ লাখ Scoville Units তকৈও অধিক হৈ পৰে!",
                    "কেঁচা জলকীয়া নিয়মীয়াকৈ কাটি থাকক আৰু ভোট জলকীয়াক গাঢ় উজ্জ্বল ৰঙা হ'বলৈ দিয়ক।"
                ),
                keyTips = listOf(
                    "Flower drop is caused by high night temperatures (>24°C) or over-fertilizing Nitrogen.",
                    "Always wear protective gloves and avoid touching eyes or face when harvesting Bhut Jolokia!"
                ),
                hindiKeyTips = listOf(
                    "ৰাতিৰ উষ্ণতা ২৪ ডিগ্ৰীতকৈ অধিক হ'লে বা নাইট্ৰ'জেন বেছি হ'লে ফুল সৰে।",
                    "ভোট জলকীয়া চপোৱাৰ সময়ত সদায় হাতত গ্লভছ পিন্ধিব আৰু চকু-মুখত হাত নিদিব!"
                )
            ),
            pollinationGuide = PollinationGuide(
                isSelfPollinating = true,
                requiresManualPollinationIndoors = true,
                flowerTypes = "Self-pollinating white flowers (Bhut Jolokia flowers cluster 2-3 per node with pale yellow-green anthers).",
                hindiFlowerTypes = "উভলিংগী সৰু বগা ফুল (ভোট জলকীয়াৰ ফুলবোৰ প্ৰতিটো গাঁথিত ২-৩ টাকৈ থোপাত ফুলে)।",
                handPollinationTechnique = "Vibrate the main trellis wire or tap branches lightly with a stick between 10 AM and 1 PM. Oscillating room fans create natural breezes that achieve near-100% pollination rates.",
                hindiHandPollinationTechnique = "ৰাতিপুৱা ১০ বজাৰ পৰা দুপৰীয়া ১ বজাৰ ভিতৰত গছজোপাৰ ডালবোৰ লাহেকৈ কঁপাই দিয়ক। ফেনৰ মৃদু বতাহেও সুন্দৰভাৱে পৰাগযোগ ঘটায়।",
                bestTimeToPollinate = "10:00 AM - 1:00 PM",
                optimalHumidityForPollen = "60% - 70% RH"
            ),
            pruningGuide = PruningGuide(
                trellisingMethod = "Bush staking using 3-4 bamboo stakes or a circular support cage to keep heavy fruiting branches off the ground.",
                hindiTrellisingMethod = "অসমৰ থলুৱা বাঁহৰ ৩-৪ টা কামি চাৰিওফালে পুতি ৰছীৰে মেৰিয়াই জোপোহাটোক ওপৰলৈ ধৰি ৰাখক যাতে ফলৰ ভৰত ডাল ভাঙি নাযায়।",
                suckeringRules = "Prune lower small suckers below the first main fork. After the fork, allow all branches to grow bushy.",
                hindiSuckeringRules = "প্ৰথম 'Y' বিভাজনৰ তলৰ সৰু সৰু পাত আৰু ডালবোৰ কাটি পেলাওক। ওপৰৰ ভাগত সকলো ডাল বাঢ়িব দিয়ক।",
                leafPruning = "Remove dense inner leaves in the center of the bush to allow sunlight to penetrate inner fruit clusters.",
                hindiLeafPruning = "জোপোহাৰ একেবাৰে মাজৰ ঘন পাতবোৰ মাজে মাজে কাটি দিয়ক যাতে ভিতৰলৈ পোহৰ আৰু বতাহ সোমাব পাৰে।",
                toppingRule = "Mandatory early topping at 15-20 cm height.",
                hindiToppingRule = "১৫-২০ চেমি উচ্চতাত প্ৰাৰম্ভিকভাৱে ওপৰৰ আগটো চিঙি দিয়ক।"
            ),
            nutrientRecipe = NutrientRecipe(
                vegetativeNpk = "12-10-30 + Calcium Nitrate (EC 1.8)",
                floweringFruitingNpk = "8-15-36 + Calcium Nitrate + Magnesium Sulfate (EC 2.2 - 2.8)",
                partADetails = "Calcium Nitrate: 1.2 g/L + Iron Chelate: 0.04 g/L",
                partBDetails = "Chilli/Hydro NPK: 1.2 g/L",
                partCDetails = "Epsom Salt (MgSO4): 0.6 g/L",
                mixingGuide = "Dissolve Part B and Part C in water, then add Part A. Target EC 2.2-2.5 during peak fruiting.",
                hindiMixingGuide = "১০০ লিটাৰ পানীত ১২০ গ্ৰাম NPK (Part B), ৬০ গ্ৰাম এপচম চল্ট (Part C) আৰু ১২০ গ্ৰাম কেলচিয়াম নাইট্ৰেট (Part A) মিহলাওক। EC ২.২ ৰ পৰা ২.৫ বজাই ৰাখক।",
                flushSchedule = "Flush reservoir with plain water once every 2 weeks.",
                hindiFlushSchedule = "প্ৰতি ২ সপ্তাহত এবাৰ বিশুদ্ধ পানীৰে ফ্ল্যাশ কৰক।"
            ),
            harvestingGuide = "Harvest green chillies when fully plump and firm. For Bhut Jolokia, pick when fruits turn deep scarlet red with their characteristic bumpy, wrinkly skin. Use sharp scissors with 1 cm stem intact.",
            hindiHarvestingGuide = "কেঁচা জলকীয়া ডাঙৰ আৰু টান হ'লে কেঁচীৰে কাটি লওক। ভোট জলকীয়াৰ ক্ষেত্ৰত যেতিয়া ইয়াৰ খহটা কোঁচ খোৱা আৱৰণটো উজ্জ্বল ৰঙা হৈ পৰে, তেতিয়া ১ চেমি ঠাৰি ৰাখি কাচিৰে চপাওক। বজাৰত শুকান আৰু কেঁচা দুয়োধৰণৰ ভোট জলকীয়াৰ উচ্চ চাহিদা থাকে।",
            commonPestsAndDiseases = listOf(
                "Chilli Thrips (Causes leaf margins to curl upward into a boat-shape and stunts growing tips; spray neem oil or spinosad)",
                "Yellow Leaf Curl Virus (Transmitted by whiteflies; prevent with physical insect nets)",
                "Anthracnose (Sunken dark circular lesions on ripe peppers; avoid overhead misting)",
                "Broad Mites (Down-curled distorted leaves; spray sulfur or introduce predatory mites)"
            ),
            hindiCommonPestsAndDiseases = listOf(
                "থ্ৰিপছ পোক (পাতবোৰ নাওৰ দৰে ওপৰলৈ কোঁচ খাই যায় - নিম তেল স্প্ৰে' কৰক)",
                "বগা মাখি আৰু ভাইৰাছ (হালধীয়া আঠাযুক্ত কাৰ্ড আৰু মহৰ জাল ব্যৱহাৰ কৰক)",
                "জলকীয়াৰ পচা দাগ ৰোগ বা এনথ্ৰাকন'জ (পকা জলকীয়াত ক'লা দাগ পৰে - জলকীয়াত পানী ছটিওৱাৰ পৰা বিৰত থাকক)",
                "মাইট পোক (পাতবোৰ তললৈ বিকৃত হৈ বেঁকা হয় - নিম তেল ব্যৱহাৰ কৰক)"
            )
        )
    )
}
