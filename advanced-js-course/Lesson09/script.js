var form = document.getElementById("theForm");

eventUtility.addEvent(form, "submit", function(evt) {
    var data = getRequestBody();
    
    var xhr = new XMLHttpRequest();

    xhr.open("POST", "textfile.txt", true);
    xhr.setRequestHeader("Content-Type",
        "application/x-www-form-urlencoded");
    
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            var status = xhr.status;
            
            if ((status >= 200 && status < 300) ||
                status === 304) {
                    alert(xhr.responseText);
                } else {
                    alert(status);
                }
        }  
    };
    
    xhr.send(data);
    
    eventUtility.preventDefault(evt);
});



var getRequestBody = function() {
    var values = [];
    
    for (var i = 0, l = form.elements.length; i < l; i = i + 1) {
        var el = form.elements[i],
            name = encodeURIComponent(el.name),
            value = encodeURIComponent(el.value),
            complete = name + "=" + value;
        
        values.push(complete);
    }
    
    return values.join("&");
};