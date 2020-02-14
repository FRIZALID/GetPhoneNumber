var GetPhoneNumber = function() {
};

var GetPhoneNumberError = function(code, message) {
  this.code = code || null;
  this.message = message || '';
};

GetPhoneNumber.NO_TELEPHONE_NUMBER = 0;

GetPhoneNumber.prototype.get = function(success, fail) {
  exec(success, fail, 'GetPhoneNumber', 'get', []);
};

//-------------------------------------------------------------------

if (!window.plugins) {
  window.plugins = {};
}
if (!window.plugins.GetPhoneNumber) {
  window.plugins.GetPhoneNumber = new GetPhoneNumber();
}

if (module.exports) {
  module.exports = GetPhoneNumber;
}
