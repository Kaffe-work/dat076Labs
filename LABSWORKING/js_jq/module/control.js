/*

    This is the control part connecting the table module and the page

*/
// Function run when DOM is finished loading (= document.ready() )
$(function() {

    // Connecting eventhandlers to elements, jQuery style
    $("#create").on("click", control.createTable.bind(control));
           
    $("#edit").on("click", control.editTable.bind(control));

});

// Dummy data
var data = "The Document Object Model (DOM) is a programming interface for" +
"HTML, XML and SVG documents. It provides a structured representation of the" + " document as a tree. The DOM defines methods that allow access to the tree," + " so that they can change the document structure, style and content.";

// Singleton control object, using immediate invoke pattern
// Control interaction between DOM and table module.
// Only use jQuery DOM API
var control = (function() {

    table : null;

    return {createTable: function() {
            console.log("create table");
            $("#parent").empty();
            let rows = $("#rows").val();
            let cols = $("#cols").val();
            let striped = $("#striped").is(':checked');
            this.table = new Table(rows, cols, data.split(" "), striped);
            $("#parent").append(this.table.render());
        }, editTable: function() {
            if (this.table === null) {
            return;
          }
          $("#parent").empty();
          let row = parseInt($("#row").val());
          let col = parseInt($("#col").val());
          let value = $("#value").val();
          this.table.edit(row, col, value);
          $("#parent").append(this.table.render());
        }}
})();
