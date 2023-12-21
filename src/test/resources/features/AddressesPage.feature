@AddressesPage
Feature: Addresses Page

  @TextAndComponent
  Scenario: Text and Component Control
    Given user on the Addresses Page with Mail:"accountDetailsTestAutomation1@ronwell.net" and Password:"Ronwell.2023"
    Then should see Title: "Your Addresses" on Addresses Page
    Then should see Add New Address Button: "Add New Address" on Addresses Page


   Scenario: Add New Address
     Given user on the Addresses Page with Mail:"accountDetailsTestAutomation1@ronwell.net" and Password:"Ronwell.2023"
     When click Add New Address Button on Addresses Page
     Then should see Addresses Area Title: "Add Address" on Addresses Page
     Then should see Addresses Area Description: "Note: Unfortunately, You Can’T Change The Address On Orders That Are Being Prepared To Ship." on Addresses Page
     Then should see Addresses Area Address Title: "Address Title*" on Addresses Page
     Then should see Addresses Area Address Title Textbox on Addresses Page
     Then should see Addresses Area Phone: "Phone *" on Addresses Page
     Then should see Addresses Area Phone Textbox on Addresses Page
     Then should see Addresses Area First Name: "First Name*" on Addresses Page
     Then should see Addresses Area First Name Textbox on Addresses Page
     Then should see Addresses Area Last Name: "Last Name*" on Addresses Page
     Then should see Addresses Area Last Name Textbox on Addresses Page
     Then should see Addresses Area Company Name: "Company Name" on Addresses Page
     Then should see Addresses Area Company Name Textbox on Addresses Page
     Then should see Addresses Area Vat Number: "Vat Number" on Addresses Page
     Then should see Addresses Area Vat Number Textbox on Addresses Page
     Then should see Addresses Area Full Street Address: "Full Street Address*" on Addresses Page
     Then should see Addresses Area Full Street Address Textbox on Addresses Page
     Then should see Addresses Area Apt, Floor, Unit: "Apt, Floor, Unit*" on Addresses Page
     Then should see Addresses Area Apt, Floor, Unit Textbox on Addresses Page
     Then should see Addresses Area Country: "Country*" on Addresses Page
     Then should see Addresses Area Country Dropdown on Addresses Page
     When click Addresses Area Country Dropdown on Addresses Page
     Then should see Addresses Area Country Dropdown Option: "Select Country" on Addresses Page
     Then should see Addresses Area Country Dropdown Option: "UNITED ARAB EMIRATES" on Addresses Page
     Then should see Addresses Area City: "City*" on Addresses Page
     Then should see Addresses Area City Dropdown on Addresses Page
     When click Addresses Area City Dropdown on Addresses Page
     Then should see Addresses Area City Dropdown Option: "Select City" on Addresses Page
     Then should see Addresses Area City Dropdown Option: "أبو ظبي — Abu Dhabi" on Addresses Page
     Then should see Addresses Area City Dropdown Option: "الشارقة — Sharjah" on Addresses Page
     Then should see Addresses Area City Dropdown Option: "الفجيرة — Fujairah" on Addresses Page
     Then should see Addresses Area City Dropdown Option: "ام القيوين — Umm Al Quwain" on Addresses Page
     Then should see Addresses Area City Dropdown Option: "دبي — Dubai" on Addresses Page
     Then should see Addresses Area City Dropdown Option: "رأس الخيمة — Ras al Khaimah" on Addresses Page
     Then should see Addresses Area City Dropdown Option: "عجمان — Ajman" on Addresses Page
     Then should see Addresses Area Postal Codes: "Postal Codes*" on Addresses Page
     Then should see Addresses Area Postal Codes Textbox on Addresses Page
     Then should see Addresses Area State Province: "State / Province*" on Addresses Page
     Then should see Addresses Area State Province Textbox on Addresses Page
     Then should see Addresses Area Address Save Address Button: "Save Address" on Addresses Page
     When sendkeys Address Title: "Title" on Addresses Page
     When sendkeys Phone: "+905439459532" on Addresses Page
     When sendkeys First Name: "Test" on Addresses Page
     When sendkeys Last Name: "Otomasyon" on Addresses Page
     When sendkeys Company Name: "Ronwell Digital" on Addresses Page
     When sendkeys Vat Number: "1" on Addresses Page
     When sendkeys Full Street Address: "Full Adres" on Addresses Page
     When sendkeys Apt, Floor, Unit: "Apartman Floor" on Addresses Page
     When select Country: "UNITED ARAB EMIRATES" on Addresses Page
     When select City: "أبو ظبي — Abu Dhabi" on Addresses Page
     When sendkeys Postal Codes: "2" on Addresses Page
     When sendkeys State Province: "State" on Addresses Page
     When click Save Address Button on Addresses Page
     Then should see Set Primary Address: "Set As Primary Address" on Addresses Page
     Then should see Set Primary Address Checkbox on Addresses Page
     Then should see Address Title Header: "Address Title:" on Addresses Page
     Then should see Address Title: "Title" on Addresses Page
     Then should see Company Name Header: "Company Name:" on Addresses Page
     Then should see Company Name: "RonwellDigital" on Addresses Page
     Then should see First Name: "Test" on Addresses Page
     Then should see Last Name: "Otomasyon" on Addresses Page
     Then should see Full Street Address: "Full Adres" on Addresses Page
     Then should see Apt, Floor, Unit: "Apartman Floor" on Addresses Page
     Then should see Country: "UNITED ARAB EMIRATES" on Addresses Page
     Then should see City: "أبو ظبي" on Addresses Page
     Then should see Edit Button: "EDIT" on Addresses Page
     Then should see Delete Button: "DELETE" on Addresses Page