<%-- 
    Document   : index
    Created on : 2023年2月23日, 下午10:25:03
    Author     : Adam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="Style.css">

    <title>Northeastern University-Tuition waive Form</title>
</head>
    

<body>
<div class="wrapper">
    <h1 class="header">Northeastern University-Tuition Waiver Form</h1>
        <div class="section-1">
            <h1>Section 1</h1>

            <div>
                <label>Academic Term:</label>
                <input type="radio" name="Term" /> Fall
                <input type="radio" name="Term" /> Winter
                <input type="radio" name="Term" /> Spring
                <input type="radio" name="Term" /> Summer
            </div>

            <div>
                <label>Academic Year:</label>
                <input type="text" name="Year" />
            </div>

            <div>
                <label>Employee Status:</label>
                <input type="radio" name="EmployeeStatus" /> P/T Staff
                <input type="radio" name="EmployeeStatus" /> P/T Faculty
                <input type="radio" name="EmployeeStatus" class="ew"/> Retiree
                <input type="radio" name="EmployeeStatus" /> Other
                <input type="text" name="OtherEmployeeStatus" />
            </div>
        </div>

        <div class="section-2">

            <h1>Section 2</h1>

            <div>
                <label>Student's Name:</label>
                <input type="text" name="StudentName" />
            </div>

            <div>
                <label>Relationship to Employee:</label>
                <input type="text" name="RelationshipToEmployee" />
            </div>

            <div>
                <label>Student's NUID:</label>
                <input type="text" name="StudentNUID" />
            </div>

            <div>
                <label>Employee's Name:(if different from Studnet's)</label>
                <input type="text" name="EmployeeName" />
            </div>

            <div>
                <label>Employee's NUID:</label>
                <input type="text" name="EmployeeNUID" />
            </div>

            <div>
                <label>Department:</label>
                <input type="text" name="Department" />
            </div>

            <div>
                <label>Campus Location:</label>
                <input type="text" name="CampusLocation" />
            </div>

            <div>
                <label>Phone Number:</label>
                <input type="text" name="PhoneNumber" />
            </div>

            <div>
                <label>Supervisor's Name:</label>
                <input type="text" name="SupervisorName" />
            </div>
        </div>

        <div class="section-3">
            <h1>Section 3</h1>

            <h3>Indicate the applicaiton school or program:</h3>
            
            <div>
                
                <input type="radio" name="Undergraduate Program" /> Undergraduate Program
                <input type="radio" name="Law School(excludes employees)" /> Law School
                <input type="radio" name="Doctoral Candidate" /> Doctoral Candidate
                <input type="radio" name="CPS Undergraduate" /> CPS Undergraduate
                <input type="radio" name="Graduate School" />Graduate School
                <input type="radio" name="CPS Graduate School" /> CPS Graduate School
            </div>

            <p>
                One course per academic term may be taken one-half hour before the
                end of your workday. If this applies to you, this form must be
                signed by your supervisor below and approved by Human Resources
                Management.
            </p>

            <p>
                Complete the following course information. If you are an
                employee taking a job related course, please attach the Job Related
                Designation Form to this waiver.
            </p>

            <div>
                <h3>Course 1</h3>
                <div>
                    <label>Course No:</label>
                    <input type="text" />
                </div>
                <div>
                    <label>Course Name:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Supervisor Signature:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Credit Hrs:</label>
                    <input type="text" />
                </div>
                <div>
                    <label>Day(s):</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Time: </label>
                    <input type="text" /> AM/PM
                </div>

                <h3>Course 2</h3>
                <div>
                    <label>Course No.:</label>
                    <input type="text" />
                </div>
                <div>
                    <label>Course Name:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Supervisor Signature:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Credit Hrs.:</label>
                    <input type="text" />
                </div>
                <div>
                    <label>Day(s):</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Time: </label>
                    <input type="text" /> AM/PM
                </div>

                <h3>Course 3</h3>
                <div>
                    <label>Course No.:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Course Name:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Supervisor Signature:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Credit Hrs.:</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Day(s):</label>
                    <input type="text" />
                </div>

                <div>
                    <label>Time</label>
                    <input type="text" /> AM/PM
                </div>
            </div>
        </div>

        <div class="section-4">
            <h1>Section 4</h1>

            <div>
                In accordance with Northeastern University's Tuition Waiver Program
                Guidelines, my signature attests that I am currently enrolled in
                the above courses, or that the student listed above is my spouse,
                domestic partner or unmarried dependent child or the dependent child
                of my domestic partner as defined under current IRS tax regulations.
                I also certify that I have read the Tuition Waiver Program Guidelines.
            </div>

            <div>
                <label>Employee Signature:</label>
                <input type="text" name="EmployeeSignature" />
            </div>

            <div>
                <label>Date:</label>
                <input type="text" name="Date" />
            </div>
        </div>

        <div class="section-5">
            <h1>Section 5</h1>
            <div>
                <label>HRM Approval:</label>
                <input type="text" name="SS" />
            </div>

            <div>
                <label>Date:</label>
                <input type="text" name="Date" />
            </div>

            <br>
            <br>
        </div>

        <div class="section-6">

            <div>
                Forms will be reviewed for completeness and eligibility. You will be
                notified if any additional information is needed. Mail completed form
                to Human Resources, 250 Columbus Place or fax to (617) 373-7610. All
                waivers must be received by HRM within 30 days of the course start date.
            </div>

            
        </div>
    
</div>
</body>
</html>

