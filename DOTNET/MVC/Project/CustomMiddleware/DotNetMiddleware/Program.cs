var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

// app.MapGet("/", () => "Hello World!");

/*
app.Run(async (context) =>
{
    await context.Response.WriteAsync("Welcome to .NET Core MVC !");
});

*/


app.Use(async (context, next) =>
{
    await context.Response.WriteAsync("Welcome to .NET Core MVC ! \n");
    await next(context);
});


app.Use(async (context, next) =>
{
    await context.Response.WriteAsync("Welcome to .NET Core MVC ! 1st middleware \n");
    await next(context);
});


app.Use(async (context, next) =>
{
    await context.Response.WriteAsync("Welcome to .NET Core MVC ! 3rd middleware \n");
    await next(context);
});


app.Run(async (context) =>
{
    await context.Response.WriteAsync("Welcome to .NET Core MVC ! 2nd middleware !");
});

app.Run();