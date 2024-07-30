// document.querySelector("")==$("h1")==document.querySelectorAll("")

console.log($("img").attr("src"));
$("a").attr("href", "https://in.search.yahoo.com/?fr2=inr");

//    **changing color using js**
for (var i = 0; i < 5; i++) {
  document.querySelectorAll("button")[i].addEventListener("click", function () {
    document.querySelector("h1").style.color = "red";
  });
}

//    **changing color using jQuery**
$("button").click(function () {
  $("h1").css("color", "blue"); 
});

//   **taking input **
$("body").keydown(function (event) {
  console.log(event.key);
});

//*challenge1 */
$("body").keydown(function (event) {
  $("h1").text(event.key);
});
// **Animation**
$("button").on("click", function () {
  // $("h1").animate({ opacity: 0.5 });
  //   $("h1").animate({ margin: " 20%" });
  $("h1").slideUp().slideDown().animate({ margin: " 20%" });
});


