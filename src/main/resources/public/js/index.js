$('.toggle').on('click', function() {
  $('.container').stop().addClass('active');
});

$('.close').on('click', function() {
  $('.container').stop().removeClass('active');
});

 $("#groenten-zoek-form").submit(function(e) {
                e.preventDefault();

                let postcode = $(this.postcode).val();
                document.write(postcode);

                loadGroentenLijstByPostcode(postcode);

                });

                function loadGroentenLijstByPostcode(postcode) {

                    $.getJSON('/api/plantensoort/byPostcode/'.concat(postcode), function (plantensoorten) {

                    document.writeln();
                    for (let plantensoort of plantensoorten)
                    {
                        document.write(plantensoort.naamSoort);
                        document.writeln();
                    }
                });

                }


