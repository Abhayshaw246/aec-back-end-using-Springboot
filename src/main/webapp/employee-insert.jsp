<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring Boot Insert Page</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-orange-500 flex items-center justify-center min-h-screen">
    <div class="bg-white p-8 rounded-lg shadow-md w-full max-w-md">
        <h1 class="text-2xl font-bold mb-6">Insert Employee Data</h1>
        <form method="post" action="insert-emp-data">
            <div class="mb-4">
                <label for="EmpID" class="block text-gray-700 font-bold mb-2">EmpID</label>
                <input type="text" id="EmpID" name="EmpID" class="w-full px-3 py-2 border rounded-lg focus:outline-none focus:border-blue-500">
            </div>
            <div class="mb-4">
                <label for="EmpName" class="block text-gray-700 font-bold mb-2">EmpName</label>
                <input type="text" id="EmpName" name="EmpName" class="w-full px-3 py-2 border rounded-lg focus:outline-none focus:border-blue-500">
            </div>
            <div class="mb-4">
                <label for="EmpCity" class="block text-gray-700 font-bold mb-2">EmpCity</label>
                <input type="text" id="EmpCity" name="EmpCity" class="w-full px-3 py-2 border rounded-lg focus:outline-none focus:border-blue-500">
            </div>
            <div class="mb-4">
                <label for="EmpAddress" class="block text-gray-700 font-bold mb-2">EmpAddress</label>
                <input type="text" id="EmpAddress" name="EmpAddress" class="w-full px-3 py-2 border rounded-lg focus:outline-none focus:border-blue-500">
            </div>
            <div class="flex items-center justify-between">
                <button type="submit" class="bg-blue-500 text-white font-bold py-2 px-4 rounded-lg hover:bg-blue-700 focus:outline-none focus:bg-blue-700">Submit</button>
                <button type="reset" class="bg-gray-500 text-white font-bold py-2 px-4 rounded-lg hover:bg-gray-700 focus:outline-none focus:bg-gray-700">Reset</button>
            </div>
        </form>
    </div>
</body>
</html>
