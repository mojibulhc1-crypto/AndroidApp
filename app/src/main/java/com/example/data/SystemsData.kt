package com.example.data

import com.example.model.HydroponicSystem

object SystemsData {

    val nftSystem = HydroponicSystem(
        id = "nft",
        name = "NFT (Nutrient Film Technique)",
        hindiName = "NFT (Nutrient Film Technique) পাইপ ব্যৱস্থা",
        tagLine = "Best for Leafy Greens, Herbs & Fast-turnover Crops",
        hindiTagLine = "শাক-পাচলি, লেটুচ, লাই শাক আৰু ধনিয়াৰ বাবে শ্ৰেষ্ঠ প্ৰণালী",
        workingPrinciple = "Nutrient solution is pumped continuously to the high end of sloping food-grade PVC channels (1:30 to 1:40 slope). It flows down as a very thin, shallow 'film' (1-3 mm depth) over the root mat. The upper half of the roots stays exposed to air for unlimited oxygen absorption, while the bottom half drinks flowing water and nutrients.",
        hindiWorkingPrinciple = "খাদ্য আৰু পুষ্টি মিশ্ৰিত পানী হেলনীয়া খাদ্য-মানৰ পিভিচি (PVC) পাইপ বা চেনেলৰ মাজেৰে অবিৰতভাৱে পাম্প কৰা হয়। পানী পাইপৰ তলিত ১ ৰ পৰা ৩ মিলিমিটাৰৰ পাতল চাদৰৰ দৰে বৈ যায়। শিপাৰ তলৰ ভাগে বৈ যোৱা পানী আৰু সাৰ শুহি লয়, আৰু ওপৰৰ আধা ভাগে মুকলি বতাহৰ পৰা প্ৰচুৰ অক্সিজেন গ্ৰহণ কৰে।",
        bestCrops = listOf("Lettuce", "Spinach (Palak)", "Coriander (Dhaniya)", "Mint (Pudina)", "Bok Choy", "Kale", "Arugula", "Basil"),
        hindiBestCrops = listOf("লেটুচ শাক (Lettuce)", "অসমৰ লাই শাক (Lai Xak)", "পালেং শাক (Paleng)", "ধনিয়া (Dhania)", "পুদিনা (Pudina)", "বক্ চয় (Bok Choy)", "তুলসী (Basil)"),
        equipmentRequired = listOf(
            "UV-stabilized Food-Grade PVC Channels (Flat-bottom, 100mm x 50mm or 100mm circular)",
            "Submersible Water Pump (Flow rate: 1.5 to 2.0 Liters/minute per channel)",
            "Nutrient Reservoir Tank (100L - 500L food-grade opaque tank)",
            "Net Pots (2-inch or 3-inch) with clay pebbles (hydroton)",
            "Plumbing manifold (16mm LDPE feed line, 4mm micro-tubes, 50mm return drain pipe)",
            "A-frame or Flat channel support stand with 1:30 to 1:40 slope"
        ),
        hindiEquipmentRequired = listOf(
            "খাদ্য-মানৰ ইউভি প্ৰতিৰোধী পিভিচি চেনেল বা ৪ ইঞ্চি পাইপ (তলি চপটা হ'লে ভাল)",
            "ছাবমাৰ্চিবল ৱাটাৰ পাম্প (প্ৰতি চেনেলত ১.৫ ৰ পৰা ২.০ লিটাৰ/মিনিট প্ৰবাহ)",
            "নিউট্ৰিয়েণ্ট টেংক (১০০ ৰ পৰা ৫০০ লিটাৰৰ ক'লা অপাৰদৰ্শী টেংক)",
            "২ বা ৩ ইঞ্চিৰ নেট পট আৰু হাইড্ৰ'টন (পোৰা মাটিৰ গুটি)",
            "পাইপিং (১৬ মিমি মূল ইনলেট পাইপ, ৪ মিমি ফিডাৰ নলী আৰু ৫০ মিমি নিকাশ পাইপ)",
            "অসমৰ পকা জাতি বা ভলুকা বাঁহেৰে নিৰ্মিত A-ফ্ৰেম ষ্টেণ্ড (১:৩৫ ঢাল)"
        ),
        flowRateOrSpecs = "Slope: 1 cm drop for every 30-40 cm length (1:30 to 1:40). Flow rate: 1.5 - 2.0 Liters/minute per channel.",
        hindiFlowRateOrSpecs = "ঢাল: প্ৰতি ৩০-৪০ চেমি দৈৰ্ঘ্যত ১ চেমি নমোৱা (১:৩৫ ঢাল)। প্ৰবাহৰ গতি: প্ৰতিটো চেনেলত প্ৰতি মিনিটত ১.৫ ৰ পৰা ২.০ লিটাৰ।",
        diyBuildSteps = listOf(
            "1. Assemble sturdy frame (A-Frame or horizontal bench) ensuring precise 1:35 gradient downward toward reservoir.",
            "2. Cut 50mm holes in channels spaced 20cm apart for leafy crops.",
            "3. Position water reservoir below the lowest end to catch gravity-drained return water.",
            "4. Connect pump to high end via 16mm pipe and install independent flow control valve for each channel.",
            "5. Calibrate flow rate to exactly 1.5-2 L/min per channel with a measuring jug and stopwatch.",
            "6. Place rooted net cups inside and run pump continuously 24/7."
        ),
        hindiDiyBuildSteps = listOf(
            "১. অসমৰ জাতি বাঁহ বা জিআই পাইপেৰে মজবুত A-ফ্ৰেম তৈয়াৰ কৰি টেংকৰ ফালে ১:৩৫ ঢাল দিয়ক।",
            "২. পাইপবোৰত ২ ইঞ্চিৰ ফুটা ২০ চেমি ব্যৱধানত কাটি লওক।",
            "৩. আটাইতকৈ তলৰ মূৰত পানী টেংকলৈ ওভতি যাবলৈ ৫০ মিমি নিকাশ পাইপ লগাওক।",
            "৪. পাম্পৰ সৈতে ১৬ মিমি পাইপ সংযোগ কৰি প্ৰতিটো চেনেলত কণ্ট্ৰ'ল ভালভ বহুৱাওক।",
            "৫. জোখৰ পাত্ৰ ব্যৱহাৰ কৰি পানীৰ প্ৰবাহ প্ৰতি মিনিটত ঠিক ১.৫ ৰ পৰা ২ লিটাৰ নিৰ্ধাৰণ কৰক।",
            "৬. শিপা ওলোৱা পুলিবোৰ নেট পটত বহুৱাই পাম্পটো ২৪ ঘণ্টা চলাই ৰাখক।"
        ),
        advantages = listOf(
            "Uses 90% less water and nutrients than traditional farming.",
            "High planting density with vertical A-frames (3x to 5x more plants per sq. meter).",
            "Zero soil, no weeds, extremely clean leaves with no washing required.",
            "Rapid root oxygenation leading to 30-40% faster maturity."
        ),
        hindiAdvantages = listOf(
            "মাটিৰ খেতিতকৈ ৯০% কম পানী আৰু সাৰ খৰচ হয়।",
            "A-ফ্ৰেমত উলম্বভাৱে ৰাখি একে মাটিত ৩ ৰ পৰা ৫ গুণ বেছি শাক-পাচলি কৰিব পাৰি।",
            "মাটি আৰু অপতৃণ নোহোৱাকৈ একেবাৰে পৰিষ্কাৰ, ধোৱাৰ প্ৰয়োজন নোহোৱা সেউজীয়া পাত।",
            "শিপাই প্ৰচুৰ অক্সিজেন পোৱাৰ বাবে মাটিতকৈ ৩০-৪০% সোনকালে শস্য চপাব পাৰি।"
        ),
        disadvantages = listOf(
            "Power dependency: If pump fails or power cuts for > 2 hours in heat, roots dry out and die quickly.",
            "Not suitable for large root fruiting crops (Tomatoes, Melons) which choke channels.",
            "Root rot (Pythium) can spread rapidly through the recirculating stream if water exceeds 24°C."
        ),
        hindiDisadvantages = listOf(
            "বিদ্যুৎ নিৰ্ভৰশীলতা: গৰমত ২ ঘণ্টাতকৈ বেছি বিজুলী নাথাকিলে শিপা শুকাই যাব পাৰে।",
            "ডাঙৰ শিপাৰ ফলজাতীয় শস্যৰ (বিলাহী, তিয়ঁহ) বাবে অনুপযোগী কাৰণ শিপাই পাইপ বন্ধ কৰি দিয়ে।",
            "পানীৰ উষ্ণতা ২৪°C তকৈ বেছি হ'লে শিপা পচা বেমাৰ বিয়পিব পাৰে।"
        ),
        maintenanceTips = listOf(
            "Install a battery-inverter backup or solar UPS for the water pump.",
            "Check flow nozzles weekly to ensure no debris or root fragments cause blockages.",
            "Keep reservoir temperature between 18°C and 22°C."
        ),
        hindiMaintenanceTips = listOf(
            "পাম্পৰ বাবে এটা বেটাৰী-ইনভাৰ্টাৰ বা সৌৰ শক্তিৰ ব্যাকআপ ৰাখক।",
            "প্ৰতি সপ্তাহে পানীৰ নজেল পৰীক্ষা কৰক যাতে শিপা বা মলি লাগি পানী বন্ধ নহয়।",
            "টেংকৰ পানী ১৮°C ৰ পৰা ২২°C ৰ ভিতৰত ৰাখিবলৈ চেষ্টা কৰক।"
        )
    )

    val dutchBucketSystem = HydroponicSystem(
        id = "dutch_bucket",
        name = "Dutch Bucket (Bato Bucket) System",
        hindiName = "ডাচ বাকেট (Dutch / Bato Bucket) ড্ৰিপ ব্যৱস্থা",
        tagLine = "Gold Standard for Tomatoes, Cucumbers, Capsicum & Chillies",
        hindiTagLine = "তিয়ঁহ, বিলাহী, ক্যাপচিকাম আৰু ভোট জলকীয়াৰ বাবে বিশ্বৰ ১ নম্বৰ ব্যৱস্থা",
        workingPrinciple = "Heavy-yielding fruiting plants are planted in 10-14 Liter specialized Bato buckets filled with inert substrate (70% perlite / 30% coco or clay pebbles). Drip emitters deliver precise nutrient doses to each plant. At the bottom of each bucket, a patented siphon elbow retains a 2.5 cm deep nutrient reservoir for safety while allowing excess solution to drain back into the common drain line.",
        hindiWorkingPrinciple = "১০-১৪ লিটাৰৰ বিশেষ বাকেটত পাৰ্লাইট আৰু ক'ক'পিট ভৰাই ফলজাতীয় শস্য ৰোৱা হয়। ড্ৰিপাৰৰ জৰিয়তে পোনপটীয়াকৈ গছৰ গুৰিত পুষ্টিযুক্ত পানী টোপ টোপকৈ দিয়া হয়। তলত থকা বিশেষ ছাইফন এলব'ৰ (Siphon elbow) বাবে তলিত সদায় ২.৫ চেমি পানী জমা থাকে (যাতে বিজুলী গ'লেও গছ নুশুকায়) আৰু অতিৰিক্ত পানী নিকাশ পাইপেৰে টেংকলৈ ঘূৰি যায়।",
        bestCrops = listOf("Tomato (Tamatar)", "Cucumber (Kheera)", "Capsicum / Bell Pepper (Shimla Mirch)", "Chilli (Hari Mirch)", "Eggplant (Brinjal)", "Melons", "Zucchini"),
        hindiBestCrops = listOf("তিয়ঁহ (Cucumber)", "বিলাহী (Tomato)", "ক্যাপচিকাম / মিঠা জলকীয়া (Capsicum)", "ভোট জলকীয়া আৰু লঙ্কা (Bhut Jolokia / Chilli)", "বেঙেনা (Brinjal)", "তৰমুজ / খাৰবুজা", "জুকিনী (Zucchini)"),
        equipmentRequired = listOf(
            "Commercial Dutch/Bato Buckets (with Siphon Elbows)",
            "Growing Medium: Horticultural Perlite (Coarse grade) + Coco Coir (70:30 ratio) or Expanded Clay Pebbles (Hydroton)",
            "Main Drain Pipe: 50mm (2-inch) PVC pipe with rubber grommets",
            "Feed Line: 16mm LDPE pipe with 2-4 L/hr Pressure Compensating (PC) Drip Emitters and 4mm micro-tubing + drip stakes",
            "High-pressure Submersible Pump or In-line Pump",
            "Digital Drip Timer (programmable in seconds or minute intervals)",
            "Nutrient Reservoir (200L - 1000L)"
        ),
        hindiEquipmentRequired = listOf(
            "বাণিজ্যিক ডাচ বাকেট (ছাইফন এলব'ৰ সৈতে)",
            "গ্র'য়িং মিডিয়াম: ৭০% পাৰ্লাইট + ৩০% ক'ক'পিট বা হাইড্ৰ'টন",
            "৫০ মিমি পিভিচি নিকাশ পাইপ আৰু ৰবৰ গ্ৰ'মেট",
            "১৬ মিমি মূল ড্ৰিপ পাইপ আৰু ২-৪ লিটাৰ/ঘণ্টা ড্ৰিপাৰ আৰু ষ্টিক",
            "পাম্প আৰু ডিজিটেল ড্ৰিপ টাইমাৰ",
            "২০০ ৰ পৰা ১০০০ লিটাৰৰ নিউট্ৰিয়েণ্ট টেংক",
            "বাঁহৰ ওখ ট্ৰেলিছ ফ্ৰেম আৰু ৰছী"
        ),
        flowRateOrSpecs = "2 to 4 Liters/hour per dripper (2 drippers per bucket = 4-8 L/hr). Run 4 to 8 cycles/day (3-5 mins per cycle). Maintain 20% drainage run-off.",
        hindiFlowRateOrSpecs = "প্ৰতি ড্ৰিপাৰত ২ ৰ পৰা ৪ লিটাৰ/ঘণ্টা। দিনত ৪ ৰ পৰা ৮ বাৰ (৩-৫ মিনিটকৈ)। ২০% পানী নিকাশ হৈ ওলাই আহিব লাগে।",
        diyBuildSteps = listOf(
            "1. Drill 25mm holes along the 50mm drain pipe spaced 40-50 cm apart.",
            "2. Insert rubber grommets and push the Dutch bucket siphon elbows into the drain pipe.",
            "3. Fill buckets with pre-washed perlite-coco mix.",
            "4. Lay 16mm feed pipe along the row of buckets and punch 2 drippers per bucket with drip stakes.",
            "5. Connect pump to digital timer. Program 4 daily cycles (morning, mid-day, afternoon, evening) during daylight.",
            "6. Install vertical trellising strings overhead directly above each bucket."
        ),
        hindiDiyBuildSteps = listOf(
            "১. ৫০ মিমি নিকাশ পাইপত ৪০-৫০ চেমি ব্যৱধানত ২৫ মিমি ফুটা কৰক।",
            "২. ৰবৰ গ্ৰ'মেট লগাই বাকেটৰ ছাইফন এলব' পাইপত বহুৱাওক।",
            "৩. ধুই লোৱা পাৰ্লাইট আৰু ক'ক'পিট মিশ্ৰণ বাকেটত ভৰাওক।",
            "৪. ১৬ মিমি পাইপ পাৰি প্ৰতিটো বাকেটত ২ টাকৈ ড্ৰিপাৰ আৰু ষ্টিক বহুৱাওক।",
            "৫. পাম্পটো টাইমাৰত সংযোগ কৰি দিনত ৪-৬ বাৰ পানী পৰাকৈ ছেট কৰক।",
            "৬. বাকেটৰ ওপৰত বাঁহ বা তাঁৰৰ সৈতে ৰছী ওলোমাই দিয়ক যাতে লতা ওপৰলৈ বগাব পাৰে।"
        ),
        advantages = listOf(
            "Can support massive 5-meter tall fruiting vines with 20+ kg of fruit per plant.",
            "Built-in 2.5cm safety reservoir prevents plants from wilting for 24-48 hours during pump failure.",
            "Modular & expandable: Add or remove individual buckets anytime without shutting down the system.",
            "Zero root clogging of drainage lines thanks to the specialized siphon elbows."
        ),
        hindiAdvantages = listOf(
            "৫ মিটাৰ ওখ ডাঙৰ লতা আৰু প্ৰতিজোপা গছত ২০-৩০ কেজি ফলৰ ওজন সহজে সহিব পাৰে।",
            "ছাইফন এলব'ৰ বাবে তলিত সদায় পানী থাকে, বিজুলী গ'লেও গছবোৰ ২৪-৪৮ ঘণ্টা শুকাই নাযায়।",
            "মডিউলাৰ প্ৰণালী: যিকোনো সময়তে নতুন বাকেট যোগ কৰিব বা আঁতৰাব পাৰি।",
            "ছাইফন এলব'ৰ বাবে শিপাই নিকাশ পাইপ কেতিয়াও বন্ধ নকৰে।"
        ),
        disadvantages = listOf(
            "Requires more medium (perlite/coco) and manual potting compared to NFT.",
            "Drip stakes can occasionally clog if nutrient solution has particulate matter (use 120 mesh disc filter).",
            "Requires trellising infrastructure (overhead wires, roller hooks)."
        ),
        hindiDisadvantages = listOf(
            "NFT ৰ তুলনাত অধিক মিডিয়াম (পাৰ্লাইট/ক'ক'পিট)ৰ প্ৰয়োজন হয়।",
            "ফিল্টাৰ নিদিলে ড্ৰিপাৰত মলি লাগি পানী বন্ধ হ'ব পাৰে (১২০ মেশ্বৰ ডিস্ক ফিল্টাৰ লগাব)।",
            "ওপৰত মজবুত বাঁহ বা তাঁৰৰ ট্ৰেলিছ নিৰ্মাণ কৰিব লাগে।"
        ),
        maintenanceTips = listOf(
            "Install a disc filter (120 mesh) on the pump outlet to keep drippers 100% clean.",
            "Measure EC of drain runoff: If runoff EC is 0.5 higher than input, increase drip cycle duration.",
            "Flush with clear water once every 14 days."
        ),
        hindiMaintenanceTips = listOf(
            "পাম্পৰ মুখত ১২০ মেশ্বৰ ডিস্ক ফিল্টাৰ নিশ্চয় লগাব যাতে ড্ৰিপাৰ কেতিয়াও জাম নহয়।",
            "নিকাশ ওলোৱা পানীৰ EC জুখক; যদি বেছি হয়, সাধাৰণ পানীৰে ফ্ল্যাশ কৰক।",
            "প্ৰতি ২ সপ্তাহত এবাৰ বিশুদ্ধ পানীৰে ফ্ল্যাশ কৰক।"
        )
    )

    val dwcSystem = HydroponicSystem(
        id = "dwc",
        name = "DWC (Deep Water Culture) & Kratky Method",
        hindiName = "DWC (ডিপ ৱাটাৰ কালচাৰ) আৰু ক্ৰেটকি ফ্লোটিং পদ্ধতি",
        tagLine = "Simplest, lowest-cost hydroponic method with explosive root growth",
        hindiTagLine = "আৰম্ভণিৰ বাবে সকলোতকৈ সহজ, কম খৰচী আৰু ডাঙৰ শিপা প্ৰস্তুত কৰা পদ্ধতি",
        workingPrinciple = "In DWC, plants sit in net pots mounted on a floating styrofoam raft on top of a reservoir filled with aerated nutrient solution. A high-output air pump continuously forces air through air stones directly beneath the roots. In the non-circulating Kratky method (for greens), plants are placed over a static nutrient volume that slowly drops as the plant grows, naturally creating an expanding air zone for root respiration without needing electricity.",
        hindiWorkingPrinciple = "DWC ত থাৰ্ম'কলৰ ওপঙা ফলিত নেট পটেৰে গছবোৰ ৰখা হয়। তলত সাৰ-পানী থাকে আৰু এয়াৰ পাম্পে ২৪ ঘণ্টাই পানীত লাখ লাখ বুৰবুৰণি এৰি শিপাক অক্সিজেন যোগায়। ক্ৰেটকি (Kratky) পদ্ধতিত কোনো বিজুলী বা পাম্পৰ প্ৰয়োজন নাই—গছ ডাঙৰ হোৱাৰ লগে লগে পানীৰ স্তৰ নামি যায় আৰু মাজৰ খালী ঠাইখিনিয়েদি শিপাই বতাহৰ পৰা অক্সিজেন শুহি লয়।",
        bestCrops = listOf("Lettuce", "Basil", "Spinach", "Mint", "Kale", "Swiss Chard"),
        hindiBestCrops = listOf("লেটুচ শাক (Lettuce)", "অসমৰ লাই শাক (Lai Xak)", "পালেং শাক (Paleng)", "তুলসী (Basil)", "পুদিনা (Pudina)"),
        equipmentRequired = listOf(
            "Opaque Storage Tote (50L - 100L) or lined wood raft bed",
            "High-Density Extruded Polystyrene (XPS) foam board (30-50mm thick)",
            "Net Pots (2-inch or 3-inch)",
            "Clay Pebbles (Hydroton)",
            "Aquarium Air Pump (Dual outlet or commercial diaphragm pump)",
            "Air stones (Cylinder or disc type) + Silicone air tubing"
        ),
        hindiEquipmentRequired = listOf(
            "অপাৰদৰ্শী প্লাষ্টিক টাব (৫০ ৰ পৰা ১০০ লিটাৰৰ ক'লা বা গাঢ় টাব)",
            "থাৰ্ম'কল বা XPS ফোম বোৰ্ড (২ ইঞ্চি ডাঠ)",
            "২ বা ৩ ইঞ্চিৰ নেট পট আৰু হাইড্ৰ'টন",
            "এয়াৰ পাম্প (একুৱাৰিয়াম পাম্প বা ডায়াফ্ৰাম পাম্প)",
            "এয়াৰ ষ্টোন (বুৰবুৰণি সৃষ্টি কৰা শিল) আৰু চিলিকন নলী"
        ),
        flowRateOrSpecs = "Airflow: 1.0 to 2.0 Liters of air per minute for every 4 Liters of reservoir water. Dissolved Oxygen target: > 6-8 ppm.",
        hindiFlowRateOrSpecs = "বতাহৰ প্ৰবাহ: প্ৰতি ৪ লিটাৰ পানীত ১-২ লিটাৰ বতাহ প্ৰতি মিনিটত। পানীত দ্রবীভূত অক্সিজেন (DO): ৬-৮ ppm তকৈ অধিক।",
        diyBuildSteps = listOf(
            "1. Take a 60L dark storage tote. Drill 50mm holes in lid or XPS floating board spaced 20cm apart.",
            "2. Fill tote with water and mix hydroponic nutrients to target EC and pH.",
            "3. Place air stones flat at bottom center of tote and connect to air pump.",
            "4. Insert net pots with rooted seedlings so bottom 5mm of net pot touches the aerated nutrient water.",
            "5. Turn on air pump 24/7."
        ),
        hindiDiyBuildSteps = listOf(
            "১. ৬০ লিটাৰৰ ডাঠ টাব লওক। ঢাকনিত বা থাৰ্ম'কলত ৫০ মিমি ফুটা ২০ চেমি ব্যৱধানত কাটি লওক।",
            "২. টাবত পানী ভৰাই সাৰ মিহলাই EC আৰু pH সঠিক কৰক।",
            "৩. তলিত এয়াৰ ষ্টোন থৈ এয়াৰ পাইপৰে পাম্পৰ সৈতে সংযোগ কৰক।",
            "৪. নেট পটত পুলি ৰাখি ফুটাটোত এনেদৰে বহুৱাওক যাতে তলিৰ ৫ মিমি পানীত চুই থাকে।",
            "৫. এয়াৰ পাম্প ২৪ ঘণ্টাই চলাই ৰাখক।"
        ),
        advantages = listOf(
            "Easiest and cheapest system to build (under $30 / ₹2,000 DIY).",
            "Huge root mass: Roots grow like white silky beards with explosive foliage growth.",
            "Kratky variation requires ZERO electricity, no pump, no timer - 100% passive!",
            "Virtually impossible for water lines to clog because there are no narrow emitters."
        ),
        hindiAdvantages = listOf(
            "নিৰ্মাণ কৰিবলৈ আটাইতকৈ সহজ আৰু সস্তীয়া (মাত্ৰ ১৫০০-২০০০ টকাত সাজিব পাৰি)।",
            "শিপাবোৰ ৰেচমৰ দৰে বগা থোপা হৈ বিয়পি পৰে আৰু গছ অতি দ্ৰুতভাৱে ডাঙৰ হয়।",
            "ক্ৰেটকি পদ্ধতিত কোনো বিজুলী, পাম্প বা টাইমাৰৰ প্ৰয়োজন নাই—সম্পূৰ্ণ বিনামূলীয়া প্ৰাকৃতিক পদ্ধতি!",
            "কোনো পাইপ বা ড্ৰিপাৰ জাম হোৱাৰ ভয় নাই।"
        ),
        disadvantages = listOf(
            "Water temperature in standing tubs heats up easily in summer; water above 24°C leads to rapid root rot.",
            "Large water reservoirs are heavy (100 kg per 100L) and difficult to empty/clean without a drain valve."
        ),
        hindiDisadvantages = listOf(
            "গ্ৰীষ্মকালত টাবৰ পানী সোনকালে গৰম হ'ব পাৰে; ২৪°C ৰ ওপৰলৈ গ'লে শিপা পচিব পাৰে।",
            "টাবটো গধুৰ হৈ পৰে, সেয়েহে তলত পানী উলিয়াব পৰা টেপ লগোৱাটো ভাল।"
        ),
        maintenanceTips = listOf(
            "Wrap external bucket walls in reflective foil / thermal insulation to keep water cool.",
            "Top up with half-strength nutrient solution as water evaporates.",
            "Clean air stones monthly in 3% hydrogen peroxide."
        ),
        hindiMaintenanceTips = listOf(
            "টাবৰ বাহিৰত ছিলভাৰ ফয়েল বা থাৰ্ম'কল লগাওক যাতে ৰ'দত পানী গৰম নহয়।",
            "পানী কমিলে আধাশক্তিৰ সাৰ-পানী যোগ কৰক।",
            "মাহত এবাৰ এয়াৰ ষ্টোন পৰিষ্কাৰ কৰক।"
        )
    )

    val ebbAndFlowSystem = HydroponicSystem(
        id = "ebb_flow",
        name = "Ebb & Flow (Flood & Drain)",
        hindiName = "এব এণ্ড ফ্ল' (বানপানী আৰু নিকাশ পদ্ধতি)",
        tagLine = "Versatile system for seedling propagation, herbs, and potted plants",
        hindiTagLine = "নাৰ্ছাৰী পুলি প্ৰস্তুত কৰা, বনৌষধি আৰু পাত্ৰৰ বাবে আটাইতকৈ উপযুক্ত",
        workingPrinciple = "Plants sit in pots filled with clay pebbles or rockwool in a shallow flood tray. A submersible pump floods the tray with nutrient water from below for 10-15 minutes until it reaches an overflow drain height. Then the pump shuts off, and the solution drains completely back into the reservoir below. As water drains out, it draws fresh oxygen deep into the root pores like a syringe.",
        hindiWorkingPrinciple = "গছবোৰ উথলীয়া ট্ৰে'ত ৰখা হয়। টাইমাৰ অন হ'লে পাম্পে তলৰ টেংকৰ পৰা পানী আনি ট্ৰে'খন বুৰাই দিয়ে (বানপানী)। ১০-১৫ মিনিট পিছত পাম্প বন্ধ হয় আৰু সকলো পানী তললৈ নামি যায় (নিকাশ)। পানী নামি যোৱাৰ লগে লগে চিৰিঞ্জেৰে টানিবৰ দৰে সতেজ বতাহ শিপাৰ মাজলৈ সোমাই যায়।",
        bestCrops = listOf("Seedling Nursery Trays", "Strawberries", "Herbs", "Spinach", "Bonsai / Houseplants"),
        hindiBestCrops = listOf("নাৰ্ছাৰী আৰু পুলি প্ৰস্তুত কৰা", "ষ্ট্ৰবেৰী", "বনৌষধি শাক", "পালেং"),
        equipmentRequired = listOf(
            "Commercial Flood Tray (ABS plastic with drainage channels)",
            "Flood & Drain Fitting kit (1 fill nozzle, 1 overflow standpipe with extension risers)",
            "Submersible Pump with timer",
            "Nutrient Reservoir beneath the table"
        ),
        hindiEquipmentRequired = listOf(
            "ফ্লাড ট্ৰে' (উথলীয়া প্লাষ্টিক ট্ৰে')",
            "ফ্লাড আৰু নিকাশ ফিটিং কিট (অভাৰফ্ল' পাইপ)",
            "ছাবমাৰ্চিবল পাম্প আৰু টাইমাৰ",
            "ট্ৰে'ৰ তলত নিউট্ৰিয়েণ্ট টেংক"
        ),
        flowRateOrSpecs = "Flood 3 to 5 times per day (each flood lasting 10-15 minutes). Completely drain within 5 minutes.",
        hindiFlowRateOrSpecs = "দিনত ৩ ৰ পৰা ৫ বাৰ পানী ভৰোৱা (প্ৰতিবাৰ ১০-১৫ মিনিট)। ৫ মিনিটৰ ভিতৰত সম্পূৰ্ণ খালী হ'ব লাগিব।",
        diyBuildSteps = listOf(
            "1. Mount flood tray on sturdy waist-high table with a slight pitch toward the drain corner.",
            "2. Install the inlet fitting and overflow pipe (set overflow height to 50mm).",
            "3. Place reservoir underneath tray and connect pump to inlet fitting.",
            "4. Set timer to flood for 15 minutes 4 times daily."
        ),
        hindiDiyBuildSteps = listOf(
            "১. মেজৰ ওপৰত ট্ৰে'খন ৰাখি নিকাশৰ ফালে সামান্য হেলনীয়া কৰক।",
            "২. ইনলেট আৰু অভাৰফ্ল' পাইপ ফিট কৰক (উচ্চতা ৫০ মিমি)।",
            "৩. তলত টেংক ৰাখি পাম্পৰ নলী ইনলেটত লগাওক।",
            "৪. টাইমাৰত দিনত ৪ বাৰ ১৫ মিনিটকৈ চলাবলৈ ছেট কৰক।"
        ),
        advantages = listOf(
            "Unbelievable root oxygenation as draining water acts as a piston pulling air.",
            "Can accept any pot size, rockwool cubes, or net cups simultaneously.",
            "Very low maintenance and reliable."
        ),
        hindiAdvantages = listOf(
            "পানী ওলাই যোৱাৰ লগে লগে শিপাই অপাৰ সতেজ অক্সিজেন পায়।",
            "যিকোনো আকাৰৰ পাত্ৰ বা কাপ একেলগে ট্ৰে'ত ৰাখিব পাৰি।",
            "অতি কম তত্ত্বাৱধানৰ প্ৰয়োজন।"
        ),
        disadvantages = listOf(
            "Requires careful height calibration of overflow pipes.",
            "Salt buildup on clay pebbles requires periodic top-flushing."
        ),
        hindiDisadvantages = listOf(
            "অভাৰফ্ল' পাইপৰ উচ্চতা নিখুঁতভাৱে মিলাব লাগে।",
            "হাইড্ৰ'টনৰ ওপৰত সাৰৰ লৱণ জমা হ'ব পাৰে।"
        ),
        maintenanceTips = listOf("Clean the flood tray surface monthly to remove salt crusts."),
        hindiMaintenanceTips = listOf("মাহত এবাৰ ট্ৰে'ৰ উপৰিভাগ পৰিষ্কাৰ কৰক।")
    )

    val dripSystem = HydroponicSystem(
        id = "drip",
        name = "Drip Hydroponics (Top Drip)",
        hindiName = "টপ ড্ৰিপ হাইড্ৰ'পনিক্স (গ্ৰ'বেগ ড্ৰিপ পদ্ধতি)",
        tagLine = "Widely used commercial system for heavy vegetables in grow bags",
        hindiTagLine = "ব্যৱসায়িকভাৱে গ্ৰ'বেগত গধুৰ শাক-পাচলি খেতিৰ বাবে সৰ্বাধিক ব্যৱহৃত পদ্ধতি",
        workingPrinciple = "Nutrient solution is pumped through lateral irrigation tubes directly to micro-emitters placed at the base of each plant stem. It slowly drips into media (coco coir, perlite, or rockwool slabs). Can be Run-to-Waste (non-recovery) for ultra-precise nutrient balance or Recirculating (recovery) for water saving.",
        hindiWorkingPrinciple = "পানী আৰু সাৰ পাইপৰ জৰিয়তে পোনপটীয়াকৈ ক'ক'পিটৰ গ্ৰ'বেগত থকা প্ৰতিজোপা গছৰ গুৰিত ড্ৰিপাৰেৰে টোপটোপকৈ দিয়া হয়। নিকাশ হোৱা পানী পুনৰ টেংকলৈ ওভতাই আনিব পাৰি বা নিষ্কাশন কৰিব পাৰি।",
        bestCrops = listOf("Tomato", "Cucumber", "Capsicum", "Chilli", "Eggplant", "Strawberry"),
        hindiBestCrops = listOf("তিয়ঁহ", "বিলাহী", "ক্যাপচিকাম", "ভোট জলকীয়া", "বেঙেনা", "ষ্ট্ৰবেৰী"),
        equipmentRequired = listOf(
            "Coco Peat Grow Bags or Rockwool Slabs",
            "16mm Main line + 4mm Arrow drippers / PC drippers (2-4 L/hr)",
            "Pump + Multi-event digital timer",
            "Drainage collection gutters"
        ),
        hindiEquipmentRequired = listOf(
            "ক'ক'পিট গ্ৰ'বেগ বা ৰকউল শ্লেব",
            "১৬ মিমি মূল পাইপ + ৪ মিমি এৰ' ড্ৰিপাৰ (২-৪ লিটাৰ/ঘণ্টা)",
            "পাম্প আৰু টাইমাৰ",
            "নিকাশ পানী জমা কৰা নলা"
        ),
        flowRateOrSpecs = "Drip volume: 100-250 ml per shot, 5-10 times daily depending on crop stage and solar radiation.",
        hindiFlowRateOrSpecs = "প্ৰতি শ্বটত ১০০-২৫০ মিলিলিটাৰ, ৰ'দ আৰু গছৰ আকাৰ অনুসৰি দিনত ৫-১০ বাৰ।",
        diyBuildSteps = listOf(
            "1. Lay grow bags in rows with drainage gradient.",
            "2. Lay 16mm drip tube and punch drippers into bags.",
            "3. Test dripper uniformity across all rows.",
            "4. Plant seedlings into pre-cut holes."
        ),
        hindiDiyBuildSteps = listOf(
            "১. গ্ৰ'বেগবোৰ ঢাল থকা শাৰীত সজাওক।",
            "২. ১৬ মিমি পাইপ পাৰি প্ৰতিটো বেগত এৰ' ড্ৰিপাৰ বহুৱাওক।",
            "৩. সকলো ড্ৰিপাৰত সমান পানী পৰাটো পৰীক্ষা কৰক।",
            "৪. বেগত ফুটা কৰি পুলি ৰোপণ কৰক।"
        ),
        advantages = listOf(
            "Extremely scalable from 10 plants to 100,000 plants.",
            "Individual plant nutrition control.",
            "Substrate provides a buffer against pump delays."
        ),
        hindiAdvantages = listOf(
            "১০ জোপা গছৰ পৰা ১ লাখ গছলৈকে কিমানো ডাঙৰকৈ স্থাপন কৰিব পাৰি।",
            "ক'ক'পিটৰ বাবে পানী ১-২ দিন বন্ধ থাকিলেও আৰ্দ্ৰতা থাকি যায়।"
        ),
        disadvantages = listOf("Emitters can clog without proper 120 mesh disc filtration."),
        hindiDisadvantages = listOf("ফিল্টাৰ নিদিলে ড্ৰিপাৰত মলি সোমাব পাৰে।"),
        maintenanceTips = listOf("Flush drip lines with 1% nitric acid or clean water at the end of each season."),
        hindiMaintenanceTips = listOf("বতৰৰ শেষত পাইপবোৰ পৰিষ্কাৰ পানীৰে ফ্ল্যাশ কৰক।")
    )

    val aeroponicsSystem = HydroponicSystem(
        id = "aeroponics",
        name = "Aeroponics (High Pressure Misting)",
        hindiName = "এৰ'পনিক্স (বায়ু আৰু কুঁৱলীৰ খেতি)",
        tagLine = "Cutting-edge NASA technology: 95% less water, fastest root growth",
        hindiTagLine = "নাছা (NASA) ৰ প্ৰযুক্তি: ৯৫% কম পানী, বতাহত ওলমি থকা শিপাত পুষ্টিৰ কুঁৱলী",
        workingPrinciple = "Plant roots hang entirely suspended in mid-air inside a closed, dark chamber. High-pressure misting nozzles (atomizers) spray a fine mist of 50-micron nutrient droplets directly onto the roots for 5 seconds every 3-5 minutes. The roots enjoy 100% maximum oxygen exposure 24/7.",
        hindiWorkingPrinciple = "গছৰ শিপাবোৰ এটা অন্ধকাৰ বাকচ বা টাৱাৰৰ ভিতৰত সম্পূৰ্ণৰূপে বতাহত ওলমি থাকে। হাই-প্ৰেচাৰ মিষ্টিং নজেলে প্ৰতি ৩-৫ মিনিটত ৫ ছেকেণ্ডৰ বাবে পুষ্টিৰ অতি মিহি কুঁৱলী (৫০ মাইক্ৰন টোপাল) পোনপটীয়াকৈ শিপাত ছটিয়াই দিয়ে। শিপাবোৰে ২৪ ঘণ্টা ১০০% মুক্ত অক্সিজেন পায়।",
        bestCrops = listOf("Seed Potatoes (Tuber propagation)", "Leafy Greens", "Herbs", "Strawberries"),
        hindiBestCrops = listOf("আলুৰ বীজ আৰু মিনি-টিউবাৰ", "শাক-পাচলি", "বনৌষধি", "ষ্ট্ৰবেৰী"),
        equipmentRequired = listOf(
            "High Pressure Diaphragm Pump (60 - 100 PSI / 4-7 Bar)",
            "Stainless Steel / Brass Misting Nozzles (0.3 - 0.4mm orifice, 50 micron droplets)",
            "Cycle Repeat Timer (Programmable in seconds: e.g. 5 sec ON, 3 min OFF)",
            "Accumulator Tank to hold steady pressure",
            "5-micron inline water filter"
        ),
        hindiEquipmentRequired = listOf(
            "উচ্চ চাপৰ ডায়াফ্ৰাম পাম্প (৬০-১০০ PSI চাপযুক্ত)",
            "ষ্টেইনলেছ ষ্টীলৰ মিষ্ট নজেল (০.৩ মিমি ফুটা)",
            "ছেকেণ্ডৰ ছাইকেল টাইমাৰ (৫ ছেকেণ্ড চালু, ৩ মিনিট বন্ধ)",
            "প্ৰেচাৰ টেংক আৰু ৫-মাইক্ৰন ৱাটাৰ ফিল্টাৰ"
        ),
        flowRateOrSpecs = "Pressure: 80 PSI. Droplet size: 30 - 60 microns. Cycle: 5 seconds spray every 3 minutes.",
        hindiFlowRateOrSpecs = "চাপ: ৮০ PSI। টোপালৰ আকাৰ: ৩০-৬০ মাইক্ৰন। চক্ৰ: প্ৰতি ৩ মিনিটত ৫ ছেকেণ্ড স্প্ৰে'।",
        diyBuildSteps = listOf(
            "1. Seal an airtight dark chamber/barrel to keep root zone in total darkness.",
            "2. Install misting nozzles pointing inward at roots.",
            "3. Plumb high-pressure tubing from pump through accumulator to nozzles.",
            "4. Configure repeat cycle timer for 5s ON / 3m OFF."
        ),
        hindiDiyBuildSteps = listOf(
            "১. এটা অন্ধকাৰ বন্ধ ড্ৰাম সাজি লওক যাতে শিপাত পোহৰ নপৰে।",
            "২. ভিতৰলৈ মুখ কৰি মিহি মিষ্ট নজেল লগাওক।",
            "৩. উচ্চ চাপৰ পাম্প আৰু প্ৰেচাৰ টেংক সংযোগ কৰক।",
            "৪. টাইমাৰত ৫ ছেকেণ্ড অন আৰু ৩ মিনিট অফ ছেট কৰক।"
        ),
        advantages = listOf(
            "Fastest plant growth rate of any known agricultural method (40-60% faster).",
            "Highest water efficiency (uses 95% less water than open field).",
            "Easy root inspection and pathogen-free environment."
        ),
        hindiAdvantages = listOf(
            "পৃথিৱীৰ আটাইতকৈ দ্ৰুত বৃদ্ধিৰ হাৰ (মাটিতকৈ ৫০% বেছি দ্ৰুত)।",
            "৯৫% পৰ্যন্ত পানীৰ ৰাহি।",
            "শিপা মুকলি হৈ থকাৰ বাবে কোনো বেমাৰ হ'লে তৎক্ষণাত ধৰা পৰে।"
        ),
        disadvantages = listOf(
            "Extremely zero tolerance for power failure: Roots will dry and shrivel in 15-20 minutes without spray.",
            "Micro-nozzles require pristine water filtering to prevent clogging."
        ),
        hindiDisadvantages = listOf(
            "বিজুলী বন্ধ হ'লে মাত্ৰ ১৫-২০ মিনিটতে শিপা শুকাই মৰি যাব পাৰে।",
            "নজেলবোৰ অতি মিহি হোৱাৰ বাবে বিশুদ্ধ পানী আৰু ফিল্টাৰ অপৰিহাৰ্য।"
        ),
        maintenanceTips = listOf("Soak nozzles in vinegar or citric acid monthly to dissolve calcium scale."),
        hindiMaintenanceTips = listOf("মাহত এবাৰ নজেলবোৰ ভিনেগাৰ বা ছাইট্ৰিক এচিডত ধুই পৰিষ্কাৰ কৰক।")
    )

    fun getSystemsList(): List<HydroponicSystem> = listOf(
        nftSystem,
        dutchBucketSystem,
        dwcSystem,
        ebbAndFlowSystem,
        dripSystem,
        aeroponicsSystem
    )
}
