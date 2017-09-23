$('.toggle').on('click', function() {
  $('.container').stop().addClass('active');
});

$('.close').on('click', function() {
  $('.container').stop().removeClass('active');
});

$("#groenten-zoek-form").submit(function(e) {
    e.preventDefault();

    let postcode = $(this.postcode).val();

    loadGroentenLijstByPostcode(postcode);

    function loadGroentenLijstByPostcode(postcode) {
        $.getJSON('/api/plantensoort/byPostcode/'.concat(postcode), function (plantensoorten) {
            var $main = $("#mainBodyContent").empty();

            var source   = $("#groentenlijst-template").html();
            var template = Handlebars.compile(source);
            let output = template({plantensoorten});
            $main.html(output);
        });
    }
});



                    // var $list = $("<ul>").addClass("gallery");
                    //
                    // for(var ps of plantensoorten) {
                    //     var $item = $("<li>")
                    //         .append(
                    //             $("<div>").addClass("imgwrap").append($("a").attr("href", "#")));
                    //     $list.append($item);
                    // }
                    // $main.append($list);






          /*
                        <ul class="gallery">

                            <li>
                                <div class="imgwrap">
                                    <a href="#">
                                        <img src="aardappel.jpeg" alt="afbeelding van aardappels">
                                        <span class="imgmask"></span>
                                    </a>
                                </div>
                                <a href="#">
                                    <h2>Aardappel</h2>
                                </a>
                            </li>
                            */



                    /*
                    document.writeln();
                    for (let plantensoort of plantensoorten)
                    {
                        document.write(plantensoort.naamSoort);
                        document.writeln();
                    }
                    */


