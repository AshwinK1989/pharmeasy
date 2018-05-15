Feature: Dashboard Functionality

  Scenario Outline: To test the Dashboard Functionality
    Given You Click on Login In button
    And You enter "<userName>" and "<password>"
    And Click on Sign In button
    And Click on Search button 
    And Select Maritial Status as "Never Married"
    And Select Religion as "Hindu"
    And Select Mother Tongue as "Hindu"
    And Select Community as "96K Kokanastha,Agri"
    And Select Country as "India,USA"
    And Select State as "Maharashtra,Andhra Pradesh"
    And Select City as "Mumbai,Pune"
    And Select manglik/chevai dosham as "No Mangliks"
    And Click on "SEARCH NOW" button
    
    Examples: 
      | userName      | password |
      | wer129@bankas.in | test |
