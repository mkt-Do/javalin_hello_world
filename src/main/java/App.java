import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
      Javalin app = Javalin.start(7000);
      app.get("/", ctx -> ctx.result("Hello world!"));
    }
}
