// script.js

function displayPetDataInTable(data, tableId) {
    const table = $(`#${tableId}`);
    table.empty();

    if (data.length === 0) {
        table.append("<p>No data available</p>");
        return;
    }

    const headerRow = $("<tr>");
    Object.keys(data[0]).forEach(attribute => {
        headerRow.append($("<th>").text(attribute));
    });
    table.append(headerRow);

    data.sort((a, b) => (a[Object.keys(a)[0]] > b[Object.keys(b)[0]]) ? 1 : -1);

    data.forEach(item => {
        const row = $("<tr>");
        Object.values(item).forEach(value => {
            row.append($("<td>").text(value));
        });
        table.append(row);
    });
}

function getPetById() {
    const petId = $("#petId").val();
    $.get(`/pet/${petId}`, function (data) {
        displayPetDataInTable([data], "getPetTable");
    });
}

function getAllPets() {
    $.get("/pet", function (data) {
        displayPetDataInTable(data, "getAllPetsTable");
    });
}

function savePet() {
    const petName = $("#petName").val();
    const petAnimal = $("#petAnimal").val();

    $.ajax({
        type: "POST",
        url: "/pet",
        contentType: "application/json",
        data: JSON.stringify({ name: petName, animal: petAnimal }),
        success: function (data) {
            displayPetDataInTable([data], "savePetTable");
        }
    });
}

function updatePet() {
    const updatePetId = $("#updatePetId").val();
    const updatePetName = $("#updatePetName").val();
    const updatePetAnimal = $("#updatePetAnimal").val();

    $.ajax({
        type: "PUT",
        url: `/pet/${updatePetId}`,
        contentType: "application/json",
        data: JSON.stringify({ name: updatePetName, animal: updatePetAnimal }),
        success: function (data) {
            displayPetDataInTable([data], "updatePetTable");
        }
    });
}

function deletePet() {
    const deletePetId = $("#deletePetId").val();

    // Check if deletePetId is empty or not a number
    if (!deletePetId || isNaN(deletePetId)) {
        $("#deletePetResult").html("<p>Please enter a valid ID for deletion</p>");
        return;
    }

    $.ajax({
        type: "DELETE",
        url: `/pet/${deletePetId}`,
        success: function (data) {
            $("#deletePetResult").text(data);
        }
    });
}
