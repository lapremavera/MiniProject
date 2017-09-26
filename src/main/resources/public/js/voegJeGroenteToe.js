$("#groenteInvulformulier").submit(function(e) {
    e.preventDefault();


                let groente = {
                    naamSoort: $(this.plantennaam).val(),
                    naamLatijn: $(this.latijnse_naam).val(),
                    groeiVoorwaarden: $(this.groeiVoorwaarden).val(),
                    beschrijvingPlantsoort: $(this.comment).val()

                };

                $.ajax({
                    method: 'post',
                    url: '/api/plantensoort',
                    contentType: 'application/json',
                    data: JSON.stringify(groente),
                    processData: false,
                    success: function() {
                        // Refresh data table
                      //loadGroentenlijst();

                    }
                });

                this.reset();
                window.location.href="feedback.html";
            });

           // loadGroentenlijst();


            function loadGroentenlijst() {

             $.getJSON('/api/plantensoorten/all', function (plantensoort) {
                    let $tbody = $("#groentenlijst-data").empty();

                    for (let groente of plantensoorten) {
                        let $removeButton = $("<button>").addClass("btn").addClass("btn-danger").text("Remove");
                        $removeButton.click(function(e) {
                            $.ajax({
                                method: 'delete',
                                url: `/api/plantensoort/${plantensoort.id}`,
                                success: loadGroentenlijst
                            });
                        });

                        let $row = $('<tr>')
                            .append($('<td>').text(plantensoort.id))
                            .append($('<td>').text(plantensoort.plantennaam))
                            .append($('<td>').text(plantensoort.latijnseNaam))
                            .append($('<td>').text(plantensoort.groeivoorwaarden))
                            .append($('<td>').text(plantensoort.info))
                            .append($('<td>').append($removeButton));
                        $tbody.append($row);
                    }
                });
            }