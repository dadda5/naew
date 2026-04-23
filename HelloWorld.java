import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) {
        String htmlContent = """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Incredible India Tourism</title>
            <style>
                body {
                    font-family: Arial;
                    background-color: #f4f4f4;
                    text-align: center;
                }
                h1 {
                    color: #ff5733;
                }
                .container {
                    display: flex;
                    flex-wrap: wrap;
                    justify-content: center;
                }
                .card {
                    margin: 15px;
                    padding: 10px;
                    background: white;
                    border-radius: 10px;
                    box-shadow: 0px 0px 10px gray;
                    width: 300px;
                }
                img {
                    width: 100%;
                    border-radius: 10px;
                }
            </style>
        </head>
        <body>

        <h1>🇮🇳 Incredible India Tourism</h1>

        <h2>Prime Minister Narendra Modi</h2>
        <img src="https://upload.wikimedia.org/wikipedia/commons/8/8d/Prime_Minister_Narendra_Modi.jpg" width="200">

        <div class="container">

            <div class="card">
                <h3>Taj Mahal</h3>
                <img src="https://upload.wikimedia.org/wikipedia/commons/d/da/Taj-Mahal.jpg">
                <p>One of the Seven Wonders of the World.</p>
            </div>

            <div class="card">
                <h3>Kerala Backwaters</h3>
                <img src="https://upload.wikimedia.org/wikipedia/commons/3/3f/Kerala_Backwaters.jpg">
                <p>Beautiful houseboats and scenic beauty.</p>
            </div>

            <div class="card">
                <h3>Goa Beaches</h3>
                <img src="https://upload.wikimedia.org/wikipedia/commons/9/9e/Goa_beach.jpg">
                <p>Famous for nightlife and beaches.</p>
            </div>

            <div class="card">
                <h3>Jaipur</h3>
                <img src="https://upload.wikimedia.org/wikipedia/commons/6/6e/Hawa_Mahal_2011.jpg">
                <p>The Pink City of India.</p>
            </div>

        </div>

        </body>
        </html>
        """;

        try {
            FileWriter file = new FileWriter("tourism.html");
            file.write(htmlContent);
            file.close();
            System.out.println("Tourism page created Modi!");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }
}
