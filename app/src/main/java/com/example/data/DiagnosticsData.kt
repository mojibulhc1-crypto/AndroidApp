package com.example.data

import com.example.model.PlantIssue

object DiagnosticsData {
    val allIssues: List<PlantIssue> = listOf(
        PlantIssue(
            id = "blossom_end_rot",
            name = "Blossom End Rot (BER)",
            hindiName = "ফলৰ তলৰ ভাগ পচি ক'লা পৰা (Blossom End Rot)",
            category = "Nutrient Deficiency",
            affectsCrops = listOf("Tomato", "Capsicum / Bell Pepper", "Chilli", "Eggplant"),
            visualSymptom = "Water-soaked sunken black leathery patch at the blossom end (bottom tip) of the fruit while the rest of the tomato or pepper looks green.",
            hindiVisualSymptom = "বিলাহী বা ক্যাপচিকামৰ আটাইতকৈ তলৰ মূৰটো ক'লা, শুকান আৰু চৰ্মৰ দৰে টান হৈ গাত পৰে, অথচ ওপৰৰ অংশটো সেউজীয়া হৈ থাকে।",
            primaryCause = "Localized Calcium (Ca) deficiency in rapidly expanding fruit cells. Often triggered NOT by lack of calcium in water, but by inconsistent watering, erratic transpiration, high humidity (>85%), or excessive EC (>3.6).",
            hindiPrimaryCause = "ফলৰ ভিতৰত কেলচিয়ামৰ (Calcium) অভাৱ। ই পানীৰ অনিয়মীয়া যোগান, অতিপাত আৰ্দ্ৰতা (>৮৫%) নাইবা সাৰৰ EC অতি টান হোৱাৰ বাবে ঘটে।",
            immediateFix = "1. Spray 0.5% Calcium Chloride or Cal-Mag foliar spray (2 ml/L) directly on young fruit clusters. 2. Verify reservoir EC and calibrate drip frequency so media never dries out.",
            hindiImmediateFix = "১. লগে লগে কেলচিয়াম ক্ল'ৰাইড বা Cal-Mag (২ মিলি/লিটাৰ) পাত আৰু কুমলীয়া ফলত স্প্ৰে' কৰক। ২. ড্ৰিপিং নিয়মীয়া কৰক যাতে ক'ক'পিট বা শিপা কেতিয়াও শুকাই নাযায়।",
            preventionTip = "Maintain consistent drip cycles, ensure root temperature is 19-22°C, and keep EC within 2.5-3.0 mS/cm.",
            hindiPreventionTip = "ড্ৰিপৰ সময় নিয়মীয়া ৰাখক আৰু পানীত কেলচিয়াম নাইট্ৰেটৰ উচিত মাত্ৰা বজাই ৰাখক।"
        ),
        PlantIssue(
            id = "tipburn",
            name = "Tipburn (Leaf Tip Necrosis)",
            hindiName = "পাতৰ আগভাগ ক'লা হৈ পুৰি যোৱা (Tipburn)",
            category = "Nutrient / Environmental",
            affectsCrops = listOf("Lettuce", "Spinach", "Cabbage", "Kale"),
            visualSymptom = "Outer edges and tips of young developing inner leaves turn brown, curled, crispy, and die.",
            hindiVisualSymptom = "লেটুচ বা পালেং শাকৰ ভিতৰৰ নতুন কুমলীয়া পাতবোৰৰ আগ আৰু দাঁতি ক'লা-মুগা হৈ পুৰি শুকাই যায়।",
            primaryCause = "Inadequate Calcium transport to fast-growing leaf margins caused by stagnant, still air with zero airflow.",
            hindiPrimaryCause = "কোঠা বা পলিহাউচৰ ভিতৰত বতাহৰ চলাচল নোহোৱাৰ বাবে পাতৰ আগলৈ কেলচিয়াম প্ৰৱাহিত নোহোৱা।",
            immediateFix = "Mount an oscillating fan pointing directly across the crop canopy. Lower EC slightly by 0.2 mS/cm.",
            hindiImmediateFix = "শাকৰ ওপৰেদি মৃদু বতাহ বলাবলৈ বিচনী বা এক্সহষ্ট ফেন চলাওক। সাৰৰ EC ০.২ কমাই দিয়ক।",
            preventionTip = "Air movement is 100% required in indoor hydroponics. Aim for 0.3 to 0.5 m/s air velocity over lettuce heads.",
            hindiPreventionTip = "লেটুচ খেতিত সদায় পাতলীয়া বতাহৰ সোঁত ৰাখিব যাতে পাতবোৰৰ পৰা কেলচিয়াম আগলৈ যাব পাৰে।"
        ),
        PlantIssue(
            id = "iron_chlorosis",
            name = "Iron (Fe) Chlorosis",
            hindiName = "আইৰণৰ অভাৱ - নতুন পাত হালধীয়া পৰা (Iron Chlorosis)",
            category = "Nutrient Lockout",
            affectsCrops = listOf("Tomato", "Cucumber", "Capsicum", "Spinach", "Strawberry"),
            visualSymptom = "Young top leaves turn pale lemon-yellow between the veins, while the veins remain distinctly bright dark green (Interveinal Chlorosis).",
            hindiVisualSymptom = "গছৰ একেবাৰে ওপৰৰ নতুন পাতবোৰ নেমুৰ দৰে শেঁতা হালধীয়া পৰে, কিন্তু পাতৰ সিৰাবোৰ (Veins) গাঢ় সেউজীয়া হৈ থাকে।",
            primaryCause = "Almost always HIGH pH (> 6.6) causing Iron to precipitate out of water into an insoluble form.",
            hindiPrimaryCause = "পানীৰ pH ৬.৫ তকৈ বেছি হোৱাৰ ফলত পানীত থকা লো (Iron) গোট মাৰি শিপাৰ বাবে অগ্ৰাহ্য হৈ পৰা।",
            immediateFix = "Adjust reservoir pH down to 5.8 immediately using pH Down (Phosphoric Acid). Add 0.05 g/L Chelated Iron (Fe-EDDHA / Fe-DTPA).",
            hindiImmediateFix = "pH Down দি পানীৰ pH লগে লগে ৫.৮ লৈ আনক আৰু পানীত কিলেটেড আইৰণ (Fe-EDDHA) ২ গ্ৰাম মিহলাওক।",
            preventionTip = "Check and log reservoir pH every morning. Keep pH between 5.8 and 6.2.",
            hindiPreventionTip = "প্ৰতি পুৱা pH মিটাৰেৰে পানী পৰীক্ষা কৰক আৰু ৬.২ ৰ ওপৰলৈ যাব নিদিব।"
        ),
        PlantIssue(
            id = "pythium_root_rot",
            name = "Pythium Root Rot (Brown Slime)",
            hindiName = "শিপা পচা বেমাৰ (Pythium Root Rot / Brown Slime)",
            category = "Water Pathogen",
            affectsCrops = listOf("All Crops (Lettuce, Cucumber, Tomato, Spinach)"),
            visualSymptom = "Healthy white roots turn light brown, slimy, stringy, and develop a distinct swampy foul odor. Foliage wilts even though roots are submerged in water.",
            hindiVisualSymptom = "গাখীৰৰ দৰে বগা শিপাবোৰ মুগা বৰণৰ, পিছল আৰু দুৰ্গন্ধযুক্ত হৈ পৰে। শিপা পানীত থকা সত্ত্বেও দিনৰ ৰ'দত গছজোপা মৰহি যায়।",
            primaryCause = "Water temperature exceeding 24°C combined with low dissolved oxygen (< 4 ppm).",
            hindiPrimaryCause = "টেংকৰ পানী ২৪°C তকৈ গৰম হোৱা আৰু পানীত অক্সিজেনৰ অভাৱ ঘটা।",
            immediateFix = "1. Flush system. 2. Dose reservoir with 3% Food Grade Hydrogen Peroxide (H2O2) at 2-3 ml per Liter or use beneficial bacteria (Bacillus amyloliquefaciens / Hydroguard). 3. Cool reservoir water.",
            hindiImmediateFix = "১. পুৰণি পানী আঁতৰাই নতুন পানী দিয়ক। ২. পানীত ৩% হাইড্ৰ'জেন পাৰক্সাইড (২ মিলি/লিটাৰ) নাইবা উপকাৰী বেক্টেৰিয়া দিয়ক। ৩. পানী শীতল কৰক।",
            preventionTip = "Keep water reservoir below 22°C and run air stones with high-output air pump 24/7.",
            hindiPreventionTip = "টেংকৰ পানী ২২°C ৰ তলত ৰাখক আৰু এয়াৰ পাম্প ২৪ ঘণ্টাই চলাই ৰাখক।"
        ),
        PlantIssue(
            id = "powdery_mildew",
            name = "Powdery Mildew",
            hindiName = "পাউদাৰী মিলডিউ - পাতত বগা গুড়ি ভেঁকুৰ",
            category = "Fungal Disease",
            affectsCrops = listOf("Cucumber", "Tomato", "Capsicum", "Melons"),
            visualSymptom = "White flour-like powdery talcum patches appearing on upper surface of leaves, eventually causing leaves to yellow and wither.",
            hindiVisualSymptom = "পাতৰ ওপৰৰ পিঠিত আটা বা পাউদাৰৰ দৰে বগা বগা দাগ পৰে আৰু পিছলৈ পাত শুকাই মৰি যায়।",
            primaryCause = "High humidity (>75% RH) paired with poor air circulation and low light.",
            hindiPrimaryCause = "অসমৰ বাৰিষাৰ সময়ত অত্যধিক আৰ্দ্ৰতা আৰু বায়ু চলাচলৰ অভাৱ।",
            immediateFix = "Spray Potassium Bicarbonate solution (3g per 1 Liter water with 2 drops liquid dish soap) or 10% fresh milk diluted in water under sunlight.",
            hindiImmediateFix = "পটাছিয়াম বাইকাৰ্বনেট (৩ গ্ৰাম/লিটাৰ) বা ১০% কেঁচা গাখীৰৰ মিশ্ৰণ ৰ'দৰ সময়ত পাতত স্প্ৰে' কৰক।",
            preventionTip = "Prune dense lower leaves and keep exhaust fans running to hold humidity near 60-65% RH.",
            hindiPreventionTip = "তলৰ পুৰণি ঘন পাতবোৰ কাটি দিয়ক যাতে তললৈ ভালদৰে বতাহ সোমাব পাৰে।"
        ),
        PlantIssue(
            id = "nitrogen_deficiency",
            name = "Nitrogen (N) Deficiency",
            hindiName = "নাইট্ৰ'জেনৰ অভাৱ - গছৰ বৃদ্ধি বন্ধ আৰু পাত হালধীয়া পৰা",
            category = "Nutrient Deficiency",
            affectsCrops = listOf("All Crops"),
            visualSymptom = "Older bottom leaves turn pale uniform yellow, while top young leaves stay pale green. Plant growth becomes severely stunted with thin stems.",
            hindiVisualSymptom = "তলৰ পুৰণি পাতবোৰ একেথৰে হালধীয়া হৈ পৰে আৰু গছৰ বাঢ়ন সম্পূৰ্ণ স্তব্ধ হৈ পৰে।",
            primaryCause = "Nutrient EC is too low or reservoir has not been topped up with nutrients for a prolonged time.",
            hindiPrimaryCause = "পানীত সাৰৰ EC অতি কম হোৱা বা বহুদিন ধৰি নতুন সাৰ নোযোৱা।",
            immediateFix = "Add Calcium Nitrate (Part A) to bring EC to the recommended target for the crop.",
            hindiImmediateFix = "কেলচিয়াম নাইট্ৰেট আৰু NPK যোগ কৰি EC শস্যৰ প্ৰয়োজনীয় মাত্ৰালৈ বৃদ্ধি কৰক।",
            preventionTip = "Monitor EC daily and top up with fresh nutrient stock solution regularly.",
            hindiPreventionTip = "প্ৰতিদিনে EC জুখি নিয়মীয়াকৈ সাৰ যোগ কৰক।"
        )
    )
}
