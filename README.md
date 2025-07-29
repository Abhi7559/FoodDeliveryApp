🍽️ SAV — Full Stack Java Food Delivery App
Built solo. Debugged relentlessly. Styled with flavor.
A full-stack food ordering platform inspired by real-world applications like Swiggy and Zomato. Crafted using Java Servlets, JSP, and JDBC, this app delivers a seamless food-ordering experience with real-time cart, session tracking, and clean MVC-inspired logic.

🚀 Key Features
👤 User Authentication – Login system with session-based tracking
🛒 Dynamic Menu & Cart – Add/remove food items and view real-time cart updates
📦 Order Summary – Breakdown of selected items, total cost, and quantity
💳 Payment & Delivery – Capture payment mode and delivery address
🎨 Responsive UI – Mobile-friendly, dark-themed interface with custom fonts and icons

🧰 Tech Stack
| Layer        | Tools & Concepts Used                       |
| ------------ | ------------------------------------------- |
| **Backend**  | Java Servlets, JDBC, DAO Pattern            |
| **Frontend** | JSP, HTML, CSS (Poppins font, custom icons) |
| **Database** | MySQL with normalized schema                |
| **Design**   | MVC-ish flow, session management            |


📁 Project Structure
FoodApp-main/
├── src/
│   └── com/tap/
│       ├── DAO/          # Data Access Objects (OrderDAOImpl, UserDAOImpl)
│       ├── Model/        # POJOs like User, Order, Menu
│       └── Servlet/      # Controllers (OrderServlet, CheckoutServlet)
├── WebContent/
│   ├── css/              # Custom styles
│   ├── images/           # (Optional) Food visuals/icons
│   ├── menu.jsp          # Menu display page
│   ├── cart.jsp          # Cart page
│   ├── checkout.jsp      # Checkout & address input
│   ├── order.jsp         # Order summary
│   └── login.jsp         # Login & registration
├── WEB-INF/
│   └── web.xml           # Servlet configuration
├── database.sql          # MySQL schema (optional)

💡 Key Learnings
🧪 Mastered debugging complex session/cart bugs through step-by-step testing
🎯 Improved code structure and UI consistency via continuous feedback
💻 Balanced backend logic with a polished user experience
🤖 Collaborated with GitHub Copilot to accelerate development creatively

🎬 Live Demo  
▶️ [Watch the demo on Google Drive](https://drive.google.com/file/d/1Zwgp7zTJWf08iXZGER2Rhryodagqv-pq/view?usp=drive_link)

🌈 Final Thoughts
My first end-to-end full-stack project built independently — every bug, branch, and breakpoint taught me something.
From structuring DAOs to styling pixel-perfect pages, this project reflects my passion for crafting real, useful, and aesthetic software.

Made with ❤️ by Abhishek
“Every bug squashed was a lesson learned.”


