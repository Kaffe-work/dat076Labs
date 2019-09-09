/*

    Here you create a Table module usign the pseudo classical style
    Use pure JS

    - There should be an contructor function taking rows, cols, data (an array)
      and a boolean to indicate if striped.
    - The public API should have methods render and edit
    - render should return a DOM representation of the table (reuse createTable!)
    - edit should update the table data (i.e. change some index in data array)

*/

// Constructor function
function Table(rows, cols, data, striped) {
    this.rows = rows;
    this.cols = cols;
    this.data = data;
    this.striped = striped;
}

Table.prototype = (function() {

    // Public API
    return {
        // Must call this after new Table() to make table visible
        render: function() {
            let tbl = document.createElement('table');
            let tbdy = document.createElement('tbody');
            let k = 0;
            for (let i = 0; i < this.rows; i++) {
            let tr = document.createElement('tr');
            if (i % 2 === 0 && this.striped === true) {
                tr.style.background = "lightgray";
            } else {
                tr.style.background = "white";
            }
            for (let j = 0; j < this.cols; j++) {
                let td = document.createElement('td');
                let text = document.createTextNode(this.data[k++]);
                td.appendChild(text);
                tr.appendChild(td);
            }
            tbdy.appendChild(tr);
            }
            tbl.appendChild(tbdy);
            return tbl;
        },

        edit: function(row, col, value) {
            this.data[row * this.cols + col] = value;
        }
    };

})();
