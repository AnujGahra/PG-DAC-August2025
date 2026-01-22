var builder = WebApplication.CreateBuilder(args);
// builder.Services.A ddControllers();
var app = builder.Build();

app.UseRouting();

app.UseEndpoints(endpoints =>
{
    endpoints.MapGet("/Home", async (context) =>
    {
        await context.Response.WriteAsync("This is Home Page!......");
    });
    
    endpoints.MapPost("/Home", async (context) =>
    {
        await context.Response.WriteAsync("This is Home Page from Post method!......");
    });
});

// app.MapGet("/", () => "Hello World!");
// app.Map("/Home", () => "Hello World!");

// app.MapGet("/Home", () => "Hello World! -- GET");

// app.MapPost("/Home", () => "Hello World! -- Post");

// app.MapPut("/Home", () => "Hello World! -- Put");

// app.MapDelete("/Home", () => "Hello World! -- Delete");
app.Run();