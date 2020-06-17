#
# OpenAPI Petstore
# This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: "" \\
# Version: 1.0.0
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.OUTPUTS

EnumClass<PSCustomObject>
#>

function Initialize-PSEnumClass {
    [CmdletBinding()]
    Param (
    )

    Process {
        'Creating PSCustomObject: PSPetstore => PSEnumClass' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $PSO = [PSCustomObject]@{
        }

        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to EnumClass<PSCustomObject>

.DESCRIPTION

Convert from JSON to EnumClass<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

EnumClass<PSCustomObject>
#>
function ConvertFrom-PSJsonToEnumClass {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSPetstore => PSEnumClass' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PSEnumClass
        $AllProperties = ()
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        $PSO = [PSCustomObject]@{
        }

        return $PSO
    }

}
