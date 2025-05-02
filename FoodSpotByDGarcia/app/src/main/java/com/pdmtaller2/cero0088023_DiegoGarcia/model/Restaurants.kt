package com.pdmtaller2.cero0088023_DiegoGarcia.model

val restaurants = listOf(
    // COMIDA RÁPIDA (4)
    Restaurant(
        id = 1,
        name = "Burger King",
        description = "Cadena de hamburguesas a la parrilla",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Burger_King_2020.svg/1200px-Burger_King_2020.svg.png",
        categories = listOf("Comida rápida"),
        menu = listOf(
            Dish(
                101,
                "Whopper",
                "Hamburguesa con carne flame-grilled",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrl9cClSD1eRkx8Rr14tyu-g--CWmZ6X3EVA&s"
            ),
            Dish(
                102,
                "Chicken Fries",
                "Tiras de pollo crujientes",
                "https://burgerking.com.mt/wp-content/uploads/2020/03/Chicken-fries-500-x-500.png"
            ),
            Dish(
                103,
                "Onion Rings",
                "Aros de cebolla empanizados",
                "https://static01.nyt.com/images/2020/04/22/dining/ejm-sourdough-03/ejm-sourdough-03-mediumSquareAt3X.jpg"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "McDonald's",
        description = "Famosa cadena de hamburguesas",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/McDonald%27s_Golden_Arches.svg/640px-McDonald%27s_Golden_Arches.svg.png",
        categories = listOf("Comida rápida", "Postres y dulces"),
        menu = listOf(
            Dish(
                201,
                "Big Mac",
                "Hamburguesa con doble carne y salsa especial",
                "https://mcdonalds.com.sv/imagen/menu-products/1690993388_Bigmac_400x400px_BB.png"
            ),
            Dish(
                202,
                "McNuggets",
                "Nuggets de pollo crujientes",
                "https://mcdonalds.com.sv/imagen/menu-products/1640816959_6.%20mcnuggets%20.jpg"
            ),
            Dish(
                203,
                "McFlurry",
                "Helado con trozos de galleta",
                "https://mcdonalds.com.sv/imagen/menu-products/1697241863_400x400_MCFLURRY_OREO.png"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "KFC",
        description = "Especialistas en pollo frito",
        imageUrl = "https://upload.wikimedia.org/wikipedia/sco/thumb/b/bf/KFC_logo.svg/1200px-KFC_logo.svg.png",
        categories = listOf("Comida rápida"),
        menu = listOf(
            Dish(
                301,
                "Bucket de pollo",
                "Pollo frito crujiente",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6xSzKjfMNndJTlE6IbwkHOOKN9BBUIQfwTw&s"
            ),
            Dish(
                302,
                "Twister",
                "Wrap de pollo crujiente",
                "https://sawepecomcdn.blob.core.windows.net/kfc-web-ordering/KFC_HUN/22_Wraps/440x440/kfc_hun_twister_440x440.jpg"
            ),
            Dish(
                303,
                "Coleslaw",
                "Ensalada de repollo cremosa",
                "https://bellyfull.net/wp-content/uploads/2021/04/Coleslaw-KFC-blog-4.jpg"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Subway",
        description = "Sandwiches personalizados",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5Wc7cutXSY9sE68X9uXGGfVaulQ27umhNrg&s",
        categories = listOf("Comida rápida", "Postres y dulces"),
        menu = listOf(
            Dish(
                401,
                "BMT",
                "Sandwich con pepperoni, salami y jamón",
                "https://www.subway.com/ns/images/menu/ELS/SPA/menu-category-sandwich-italianBMT.jpg"
            ),
            Dish(
                402,
                "Tikka Chicken",
                "Pollo marinado al curry",
                "https://subwayburton.com/wp-content/uploads/tikka-sub.webp"
            ),
            Dish(
                403,
                "Cookie",
                "Galleta grande horneada",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9-1MZbh0wT-Z7NQGPLu3S6uhluZ3BUuZBIA&s"
            )
        )
    ),

    // COMIDA MEXICANA (4)
    Restaurant(
        id = 5,
        name = "La Taquería",
        description = "Tacos auténticos estilo callejero",
        imageUrl = "https://www.lataqueria.com.gt/wp-content/uploads/2020/06/Taqueria-Logotipo.png",
        categories = listOf("Comida mexicana", "Bebidas"),
        menu = listOf(
            Dish(501, "Tacos al pastor", "Con piña y cilantro", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXKjzhnTUmszUWSvaZfJFlDFe056G3i8Ygwg&s"),
            Dish(502, "Quesadillas", "Con queso Oaxaca", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpq-qmcBAob89GtFdOlXrkO-HzHm5qeG_QVA&s"),
            Dish(503, "Agua de horchata", "Bebida tradicional", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrhj1Mh_HiDOL9hVE-Z5n3NMGeP7LS6uqhNw&s")
        )
    ),
    Restaurant(
        id = 6,
        name = "El Charro",
        description = "Cocina mexicana tradicional",
        imageUrl = "https://d2gqo3h0psesgi.cloudfront.net/auto/el-charro-bar-and-restaurant-fgmpsz2l-logo.png",
        categories = listOf("Comida mexicana"),
        menu = listOf(
            Dish(601, "Mole poblano", "Pollo con salsa de chocolate", "https://mmmole.com/wp-content/uploads/2019/01/mole-poblano-11-480x270.jpg"),
            Dish(602, "Chiles en nogada", "Chiles rellenos con salsa de nuez", "https://www.aceitesdeolivadeespana.com/wp-content/uploads/2019/05/receta_de_chiles_en_nogada.jpeg"),
            Dish(603, "Pozole", "Sopa tradicional de maíz", "https://sabrosano.com/wp-content/uploads/2020/05/Pozole_06.jpg")
        )
    ),
    Restaurant(
        id = 7,
        name = "Taco Bell",
        description = "Fusión de comida rápida y sabores mexicanos",
        imageUrl = "https://www.ifpg.org/pub/franchiselistingslogo/20211220160523_tacobelllogo.jpeg",
        categories = listOf("Comida mexicana", "Postres y dulces"),
        menu = listOf(
            Dish(701, "Crunchwrap", "Wrap crujiente con relleno", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQU40kzktW62A1B1r3LCepsybO2jrqT2nZE-w&s"),
            Dish(702, "Cheesy Gordita", "Taco con capa de pan suave", "https://theeburgerdude.com/wp-content/uploads/2023/02/Cheesy-Gordita-Crunch-scaled.webp"),
            Dish(703, "Cinnabon Delights", "Postre de canela", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3PZzC-HLAm5yPxQjQnIK4XpovIxMNCTJB-g&s")
        )
    ),
    Restaurant(
        id = 8,
        name = "Casa de los Burritos",
        description = "Especialistas en burritos gigantes",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5rB5jgLrLr_4gMuQR8EohM1QpvAgsoX34-w&s",
        categories = listOf("Comida mexicana", "Postres y dulces"),
        menu = listOf(
            Dish(801, "Burrito carnitas", "Relleno de cerdo desmenuzado", "https://static1.squarespace.com/static/60ff20587f00f42b9b296006/t/612268d1597e8b6a0df16d3c/1629645014265/Burrito+de+carnitas-3136.JPG?format=1500w"),
            Dish(802, "Burrito vegano", "Con frijoles y verduras", "https://storage.googleapis.com/avena-recipes-v2/2019/10/1571780047769.jpeg"),
            Dish(803, "Churros", "Postre frito con canela", "https://ca-times.brightspotcdn.com/dims4/default/3eccc73/2147483647/strip/false/crop/1140x1500+0+0/resize/1129x1486!/quality/75/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F03%2Fd3%2Fab6da853405b956a499f9ce345b2%2Fchurros-llenos-de-sabor-1496885.JPG")
        )
    ),

    // COMIDA ITALIANA (4)
    Restaurant(
        id = 9,
        name = "Pizzeria Napoli",
        description = "Pizzas al estilo napolitano",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0b7_Gaa_QXVneFwObYsQfdrYyDowxj76awA&s",
        categories = listOf("Comida italiana"),
        menu = listOf(
            Dish(901, "Pizza Margherita", "Clásica con tomate y mozzarella", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZk4UPpIsuM1lvkV36tCE20R199V3iRx9FFQ&s"),
            Dish(902, "Calzone", "Pizza doblada rellena", "https://okdiario.com/img/recetas/2017/07/12/pizza-calzone-3.jpg"),
            Dish(903, "Bruschetta", "Pan tostado con tomate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQZlEQcuxdS9Cp5MVsuxtYigZMnxMPn656ZQ&s")
        )
    ),
    Restaurant(
        id = 10,
        name = "Trattoria Romana",
        description = "Pastas artesanales",
        imageUrl = "https://zeroseimalta.com/wp-content/uploads/2017/10/zero-sei-logo-1.png",
        categories = listOf("Comida italiana", "Postres y dulces"),
        menu = listOf(
            Dish(1001, "Spaghetti Carbonara", "Con huevo y panceta", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTocnT-UeCFm5CnI92RPn7zFsCJMH2AEW60vA&s"),
            Dish(1002, "Lasagna", "Capas de pasta con carne", "https://static01.nyt.com/images/2023/08/31/multimedia/RS-Lasagna-hkjl/RS-Lasagna-hkjl-threeByTwoMediumAt2X.jpg"),
            Dish(1003, "Tiramisú", "Postre de café", "https://www.paulinacocina.net/wp-content/uploads/2020/01/receta-de-tiramisu-facil-y-economico-1740483918-1200x900.jpg")
        )
    ),
    Restaurant(
        id = 11,
        name = "Ristorante Venezia",
        description = "Especialidades del norte de Italia",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHqY2K5HvuBnwsKX1aTexszi97Y_auSkvprA&s",
        categories = listOf("Comida italiana", "Postres y dulces"),
        menu = listOf(
            Dish(1101, "Risotto ai funghi", "Arroz cremoso con hongos", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSdAzIJignFUDVEfvhA0AooI8Z8LAgLU_ONQ&s"),
            Dish(1102, "Polenta", "Harina de maíz cocida", "https://images.cookforyourlife.org/wp-content/uploads/2017/07/easy-polenta-e1720730553758.jpg"),
            Dish(1103, "Panna Cotta", "Postre cremoso", "https://upload.wikimedia.org/wikipedia/commons/0/01/Panna_cotta_with_chocolate_mousse.jpg")
        )
    ),
    Restaurant(
        id = 12,
        name = "Gelateria Fiore",
        description = "Helados artesanales italianos",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkPZfciLAXLL9FEuhGWB418aj-7ePoEOEldg&s",
        categories = listOf("Comida italiana", "Postres y dulces"),
        menu = listOf(
            Dish(1201, "Gelato di cioccolato", "Helado de chocolate intenso", "https://www.giallozafferano.it/images/ricette/13/1395/foto_hd/hd650x433_wm.jpg"),
            Dish(1202, "Sorbetto al limone", "Sorbete de limón refrescante", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdbimjU9Xg4UtAZqONKkYPTBnpq9sZ8oUcYw&s"),
            Dish(1203, "Affogato", "Helado con shot de espresso", "https://static01.nyt.com/images/2021/08/15/magazine/affogato/affogato-mediumSquareAt3X-v2.jpg")
        )
    ),

    // COMIDA ASIÁTICA (4)
    Restaurant(
        id = 13,
        name = "Wok Express",
        description = "Cocina china rápida",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn2qMnjJNPUwcSKE4ka-Qj-Zrcg-rouSoPqA&s",
        categories = listOf("Comida asiática"),
        menu = listOf(
            Dish(1301, "Arroz frito", "Con verduras y huevo", "https://domicilio.pandaexpress.com.sv/img/co/38.jpg"),
            Dish(1302, "Cerdo agridulce", "En salsa característica", "https://imag.bonviveur.com/cerdo-agridulce.jpg"),
            Dish(1303, "Rollitos de primavera", "Crujientes con verduras", "https://i.blogs.es/40e6e2/rollitos_primavera/1366_2000.jpg")
        )
    ),
    Restaurant(
        id = 14,
        name = "Sushi Palace",
        description = "Sushi fresco y creativo",
        imageUrl = "https://tb-static.uber.com/prod/image-proc/processed_images/821b4ef3a581328d2b81d146708035df/3ac2b39ad528f8c8c5dc77c59abb683d.jpeg",
        categories = listOf("Comida asiática"),
        menu = listOf(
            Dish(1401, "Sashimi", "Pescado crudo fresco", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEPFc5tCFeCaBFFyWIVHWVWAAFu54WtTvCSQ&s"),
            Dish(1402, "California Roll", "Con cangrejo y aguacate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTYQYycjLs1qQmudHn2euaFGSsEAt-W0YHQQ&s"),
            Dish(1403, "Tempura", "Verduras y mariscos empanizados", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmuz7BaqJfIgkIJEyvQAEYgc31HI0mf4_rEQ&s")
        )
    ),
    Restaurant(
        id = 15,
        name = "Thai Garden",
        description = "Auténtica cocina tailandesa",
        imageUrl = "https://images.squarespace-cdn.com/content/v1/5ef52c191250a85af340e864/eb6cf664-65e5-4b2c-b05e-f6281dea82d1/Thai+Garden+Green+BG.jpg",
        categories = listOf("Comida asiática", "Postres y dulces"),
        menu = listOf(
            Dish(1501, "Pad Thai", "Fideos salteados tradicionales", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShwYrVcIr4VONXvVcy2wFeBtyH76UucAJ3og&s"),
            Dish(1502, "Tom Yum", "Sopa picante y agria", "https://dishmagazine.com/wp-content/uploads/2024/08/quick-tom-yum-soup-1300x1101.jpg"),
            Dish(1503, "Mango Sticky Rice", "Postre con mango y arroz", "https://rachelcooksthai.com/wp-content/uploads/2012/08/Mango-Sticky-Rice-03-500x500.jpg")
        )
    ),
    Restaurant(
        id = 16,
        name = "Ramen House",
        description = "Especialistas en ramen",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_qjVFZicBmmRNaW9StwFpchfKJCxKoEiSYQ&s",
        categories = listOf("Comida asiática", "Postres y dulces"),
        menu = listOf(
            Dish(1601, "Tonkotsu Ramen", "Caldo de cerdo cremoso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjl2sJADQCQfn4vkeuc3LaXkoAQE89IYJXpw&s"),
            Dish(1602, "Gyoza", "Empanadillas japonesas", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQSstpLE7w6qzA_x6iAqEcIWXJAsEUoUcHDQ&s"),
            Dish(1603, "Matcha Ice Cream", "Helado de té verde", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYSsngTLNYtkSYOtrKo6jscRDHPFd0PMuE0w&s")
        )
    ),

    // COMIDA SALUDABLE (4)
    Restaurant(
        id = 17,
        name = "Green Life",
        description = "Comida orgánica y vegana",
        imageUrl = "https://www.greenlife-cookware.com/cdn/shop/t/31/assets/social.jpg?v=161658783457108362411624923916",
        categories = listOf("Comida saludable", "Bebidas"),
        menu = listOf(
            Dish(1701, "Buddha Bowl", "Mezcla de superfoods", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT522XOa4l9_r_Z5kOKHwFYouTHdXpogtu-Pw&s"),
            Dish(1702, "Zoodles", "Fideos de calabacín", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyr-Q8_EgkOLmuIlNZJkjFsi7AeBzaekxWLg&s"),
            Dish(1703, "Smoothie verde", "Con espinaca y frutas", "https://www.vitamixespana.com/recetas/wp-content/uploads/2018/04/smoothie-verde-vitamix.jpg")
        )
    ),
    Restaurant(
        id = 18,
        name = "Superfood Bar",
        description = "Platos ricos en nutrientes",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0yaHmcFLpd1SfH-rH47qZiUFwQEipLbM72QgGxbwCrFgiwyDrKvkHAJvGi-xOcsc6qf0&usqp=CAU",
        categories = listOf("Comida saludable", "Bebidas"),
        menu = listOf(
            Dish(1801, "Açaí Bowl", "Base de açaí con toppings", "https://static01.nyt.com/images/2023/12/20/multimedia/ND-Acai-Bowl-wbkv/ND-Acai-Bowl-wbkv-mediumSquareAt3X.jpg"),
            Dish(1802, "Quinoa Salad", "Ensalada proteica", "https://cookieandkate.com/images/2017/08/best-quinoa-salad-recipe-3.jpg"),
            Dish(1803, "Kombucha", "Bebida probiótica", "https://cienciaybiologia.com/wp-content/uploads/2018/04/hongo-scoby.jpeg")
        )
    ),
    Restaurant(
        id = 19,
        name = "Protein House",
        description = "Comida alta en proteína",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqssrTOwiUWDtN_TXWnXMgvzp5T51Sud-ihw&s",
        categories = listOf("Comida saludable", "Postres y dulces"),
        menu = listOf(
            Dish(1901, "Grilled Chicken", "Pechuga a la parrilla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWGVYaGA_psg7DLH9KeTS3mQIA_SRAKJpyvw&s"),
            Dish(1902, "Protein Pancakes", "Hot cakes proteicos", "https://images.immediate.co.uk/production/volatile/sites/30/2021/02/Protein-pancakes-b64bd40.jpg"),
            Dish(1903, "Egg White Omelette", "Tortilla de claras", "https://www.eatingbirdfood.com/wp-content/uploads/2023/09/egg-white-omelette-hero.jpg")
        )
    ),
    Restaurant(
        id = 20,
        name = "Raw Vegan",
        description = "Cocina crudivegana",
        imageUrl = "https://i0.wp.com/kennyandjoann.com/wp-content/uploads/2020/04/Raw-Vegan-Lifestyle-Success-System-main-image.png?fit=450%2C323&ssl=1",
        categories = listOf("Comida saludable", "Bebidas"),
        menu = listOf(
            Dish(2001, "Raw Lasagna", "Capas de vegetales", "https://i0.wp.com/greenevi.com/wp-content/uploads/2018/08/greenevi-raw-lasagne2.jpg?ssl=1"),
            Dish(2002, "Energy Balls", "Bolitas energéticas", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6o04PJAp_dg1wiOgnBqn1rHl1EShPN_8SzA&s"),
            Dish(2003, "Cold Pressed Juice", "Jugo prensado en frío", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEx661ght31zUqvc3fCt-B67mRI9swiJL_nA&s")
        )
    ),

    // POSTRES Y DULCES (4)
    Restaurant(
        id = 21,
        name = "Sweet Heaven",
        description = "Repostería creativa",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1AKLpfpvb0Ubm2PsF_ghuCUnbSyCXNUQdPg&s",
        categories = listOf("Postres y dulces"),
        menu = listOf(
            Dish(2101, "Red Velvet Cake", "Pastel de terciopelo rojo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZn6z9L3Mkb1bwBUlsuPEoQdpE5hmYnK2LIg&s"),
            Dish(2102, "Cheesecake", "Clásico estilo Nueva York", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqn7Pyo7hJDJfLeyYCTWk9HKiagMAuNrUeCQ&s"),
            Dish(2103, "Macarons", "Galletas francesas", "https://mandolina.co/wp-content/uploads/2024/04/Macarons-1080x550-1-1200x900.jpg")
        )
    ),
    Restaurant(
        id = 22,
        name = "Chocolate Factory",
        description = "Todo con chocolate",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlpC87zzhTpTHl0QZN6-la1N0qg3WAwhIFvOtm3dtTHQmZLXyGybai8riRBdtRaqYoaqQ&usqp=CAU",
        categories = listOf("Postres y dulces", "Bebidas"),
        menu = listOf(
            Dish(2201, "Fondue", "Chocolate derretido", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfJ4V1KRh4JiyVPoz11Pr9BaawRJWlhA2hBg&s"),
            Dish(2202, "Brownie", "Con nueces y helado", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbnNulO5UCLZrbNdPe2UKbir4nASd5fNhi0w&s"),
            Dish(2203, "Hot Chocolate", "Bebida cremosa", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnurlPAU_aWo5JU6M5OrP1aPhOjiPZkopKEw&s")
        )
    ),
    Restaurant(
        id = 23,
        name = "Donut World",
        description = "Especialistas en donas",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3Spq-R0WW_gUTTwfwHvbsz4TxBtLVlGreog&s",
        categories = listOf("Postres y dulces"),
        menu = listOf(
            Dish(2301, "Glazed Donut", "Clásica dona glaseada", "https://assets.epicurious.com/photos/54b0226d766062b20344580a/1:1/w_729,h_729,c_limit/51160200_glazed-doughnuts_1x1.jpg"),
            Dish(2302, "Cronut", "Cruasán-dona híbrido", "https://imagenes.elpais.com/resizer/v2/INVPLPV5WNPSNO6MP5EL2W2LCQ.jpg?auth=e949c974817fc6ec0fad88f711a676c50cbc376426e3c45d3b2b1e7367cd57a4&width=1960"),
            Dish(2303, "Donut Holes", "Bolitas de dona", "https://sugarspunrun.com/wp-content/uploads/2022/08/Fried-Donut-Holes-No-Yeast-1-of-1.jpg")
        )
    ),
    Restaurant(
        id = 24,
        name = "Ice Cream Dream",
        description = "Helados artesanales",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxJi_QMXd-4QSz9Diz1g1o1tzKnvEW622B8g&s",
        categories = listOf("Postres y dulces"),
        menu = listOf(
            Dish(2401, "Sundae", "Con toppings variados", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/StrawberrySundae.jpg/220px-StrawberrySundae.jpg"),
            Dish(2402, "Milkshake", "Batido espeso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStSC-0uxcLThJvWb-QO0KwWRabPhhub2Jt3w&s"),
            Dish(2403, "Waffle Cone", "Cucurucho casero", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbFSXJSYNGNj13cr7ey4L-_Jbu_wDvb0Xeaw&s")
        )
    ),

    // BEBIDAS (4)
    Restaurant(
        id = 25,
        name = "Bubble Tea House",
        description = "Tés con perlas",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIFubzMUhoTn2PYQ6NYhJtSgZHwlAx8q1M53y9SuM7ihsL8zVEbbRxPhUOk-qtlztb7Wo&usqp=CAU",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(2501, "Taro Milk Tea", "Con perlas de tapioca", "https://mixop.net/wp-content/uploads/136A0988-735x1103.jpg"),
            Dish(2502, "Matcha Latte", "Té verde con leche", "https://cdn.loveandlemons.com/wp-content/uploads/2023/06/iced-matcha-latte.jpg"),
            Dish(2503, "Fruit Tea", "Té con trozos de fruta", "https://myveganminimalist.com/wp-content/uploads/2022/04/Strawberry-Milk-Tea-Boba-11.jpg")
        )
    ),
    Restaurant(
        id = 26,
        name = "Coffee Lab",
        description = "Cafés especiales",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTsyIW1c8sfOgmC3hCQdg3yMlYgmtCkg49XEw&s",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(2601, "Cold Brew", "Café infusionado en frío", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT116wHqWZcj-V5R5ysue8exf2n2ewy1ZTOfA&s"),
            Dish(2602, "Flat White", "Café con leche cremoso", "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/flat-white-d8ada0f.jpg?quality=90&resize=440,400"),
            Dish(2603, "V60", "Método de vertido", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIr9l6ORBQfXE3JCQTVSDgCyFzogUCq0KQcg&s")
        )
    ),
    Restaurant(
        id = 27,
        name = "Fresh Juices",
        description = "Jugos naturales",
        imageUrl = "https://static.vecteezy.com/system/resources/previews/019/428/032/non_2x/fruit-juice-logo-fresh-drink-logo-illustration-fresh-juice-logo-designs-template-free-vector.jpg",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(2701, "Green Detox", "Con apio y manzana", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSK8YynJjSifXiX5atAC10BFks62NwaX0aBhg&s"),
            Dish(2702, "Tropical Mix", "Mezcla de frutas", "https://b3fcdc12.delivery.rocketcdn.me/wp-content/uploads/2023/09/tropical-fruit-juice-recipe.jpg"),
            Dish(2703, "Carrot Juice", "Jugo de zanahoria", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRScUzqPw_AkshWFL0JsdrtpvUDQ_C0QIu4vw&s")
        )
    ),
    Restaurant(
        id = 28,
        name = "Cocktail Bar",
        description = "Coctelería creativa",
        imageUrl = "https://www.shutterstock.com/image-vector/premium-quality-cocktail-alcohol-drink-600nw-2510993625.jpg",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(2801, "Mojito", "Clásico cubano", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4uSYUV_vifodCscchCCaET0xdqi2Gl39B8A&s"),
            Dish(2802, "Margarita", "Con tequila y lima", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6GXJNCdlfzrZeSGlvLSDnGCHikTpizzZitg&s"),
            Dish(2803, "Pina Colada", "Cóctel tropical", "https://bsstatic2.mrjack.es/wp-content/uploads/2020/06/Pina-colada-6.jpg")
        )
    )
)

