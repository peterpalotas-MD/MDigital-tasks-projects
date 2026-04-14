//api : https://github.com/fawazahmed0/exchange-api?tab=readme-ov-file

//currency list:
//https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies.json


//GET CURRENCY LIST WITH GBP AS BASE
//https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/gbp.json
/*
{
	"date": "2026-04-10",
	"gbp": {
		"1inch": 14.56635275,
		"aave": 0.014879285,
		"ada": 5.32276127,
		"aed": 4.93042048,
		"afn": 85.9220997,
		"agix": 12.82418869,
		"akt": 2.860204,
		"algo": 12.08627425,
		"all": 109.97938865,
		"amd": 504.8695453,
		"amp": 1488.75095757,
		"aoa": 1231.09534686,
		"ape": 14.95447847,
		"apt": 1.59937593,
		"ar": 0.77314519,
		"arb": 12.25340808,
		"ars": 1855.38531586,
        ...
}}
        */



async function getCurrencyCodes() {
  const url = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies.json";
  const response = await fetch(url);
  return await response.json();
}



async function getCurrencyValues() {
  const url = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/gbp.json";
  try {
    const response = await fetch(url);
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`);
    }

    const result = await response.json();
    return result;
    //console.log(result);
    //example for gettign value of euro
    //console.log(result.gbp.eur)
  } catch (error) {
    console.error(error.message);
  }
}




async function updateDropdown() {
  const datalist = document.getElementById("currencies");
  const currencies = await getCurrencyCodes();

  for (const [code, name] of Object.entries(currencies)) {
    const option = document.createElement("option");
    option.value = code; 
    option.label = name;
    datalist.appendChild(option);
  }
}



const invertKeyValues = obj =>
  Object.entries(obj).reduce((acc, [key, val]) => {
    acc[val] = acc[val] || [];
    acc[val].push(key);
    return acc;
  }, {});


const updateText = async () => {
  const rates = await getCurrencyValues();
  const select = document.getElementById("arr");

  const selectedCode = select.value;
  const rate = rates.gbp[selectedCode];

  console.log(selectedCode);
  console.log(rate);

  document.getElementById("money").innerText=` ${rate}`
  document.getElementById("code").innerText=`  ${selectedCode}`
};


const subButton = document.querySelector('button');
const resBlock = document.getElementById('result');
subButton.addEventListener('click', updateText);

getCurrencyCodes();
getCurrencyValues();
updateDropdown();
