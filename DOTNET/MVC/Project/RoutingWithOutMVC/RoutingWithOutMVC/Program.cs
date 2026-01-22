var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllersWithViews();
var app = builder.Build();

// app.MapGet("/", () => "Hello World!");


// app.MapDefaultControllerRoute();

/*
 Coventional based routing
 
app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=About}/{id?}"
);

*/

app.MapControllers();

app.Run();