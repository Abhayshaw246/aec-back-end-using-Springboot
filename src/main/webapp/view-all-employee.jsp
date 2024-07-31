<%@ page import="java.util.List,com.aec.training.entity.Employee" %>

<%
    List<Employee> listOfEmployees  = (List<Employee>) request.getAttribute("employeeList");
 %>
 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 min-h-screen flex items-center justify-center">
    <div class="w-full max-w-4xl mx-auto p-4">
        <div class="bg-white p-6 rounded-lg shadow-lg w-full">
            <h2 class="text-3xl font-bold mb-6 text-center text-gray-800">Employee List</h2>
            <div class="overflow-x-auto">
                <table class="min-w-full bg-white border border-gray-200 rounded-lg overflow-hidden shadow-lg">
                    <thead class="bg-gray-200 text-gray-600 uppercase text-sm leading-normal">
                        <tr>
                            <th class="py-3 px-6 text-left">EmpId</th>
                            <th class="py-3 px-6 text-left">EmpName</th>
                            <th class="py-3 px-6 text-left">EmpCity</th>
                            <th class="py-3 px-6 text-left">EmpAddress</th>
                        </tr>
                    </thead>
                    <tbody class="text-gray-600 text-sm font-light">
                        <% 
                            for(Employee emp : listOfEmployees) {
                        %>
                        <tr class="border-b border-gray-200 hover:bg-gray-100">
                            <td class="py-3 px-6 text-left whitespace-nowrap"><%= emp.getEmpId() %></td>
                            <td class="py-3 px-6 text-left whitespace-nowrap"><%= emp.getEmpName() %></td>
                            <td class="py-3 px-6 text-left whitespace-nowrap"><%= emp.getEmpCity() %></td>
                            <td class="py-3 px-6 text-left whitespace-nowrap"><%= emp.getEmpAddress() %></td>
                        </tr>
                        <% 
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
