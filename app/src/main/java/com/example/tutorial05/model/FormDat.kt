package com.example.tutorial05.model

import com.example.tutorial05.model.validation.ValidationResult

class FormDat(
    private var studentID:String,
    private var year:String,
    private var semester:String,
    private var agree:Boolean
) {
    fun validateStudentID():ValidationResult
    {
        return if(studentID.isEmpty())
        {
            ValidationResult.Empty("Student ID is Empty")
        }

        else if(studentID.length != 10 )
        {
            ValidationResult.Invalid("ID should have 10 digits")
        }

        else if(!studentID.startsWith("IT", true) )
        {
            ValidationResult.Invalid("ID number should start with IT")
        }

        else
        {
            ValidationResult.Valid
        }
    }

    fun validateYear():ValidationResult
    {
        return if(year.isEmpty())
        {
            ValidationResult.Empty("Year is Empty")
        }

        else
        {
            ValidationResult.Valid
        }
    }

    fun validateSemester():ValidationResult
    {
        return if(semester.isEmpty())
        {
            ValidationResult.Empty("Semester is Empty")
        }

        else
        {
            ValidationResult.Valid
        }
    }
    fun validateAgree():ValidationResult
    {
        return if(!agree)
        {
            ValidationResult.Empty("You must agree to the terms and conditions")
        }

        else
        {
            ValidationResult.Valid
        }
    }

}