require 'google/apis/sheets_v4'
require 'googleauth'
require 'googleauth/stores/file_token_store'

require 'fileutils'

OOB_URI = 'urn:ietf:wg:oauth:2.0:oob'
APPLICATION_NAME = 'Google Sheets API Ruby Quickstart'
CLIENT_SECRETS_PATH = 'client_id.json'
CREDENTIALS_PATH = File.join(Dir.home, '.credentials',
                             "sheets.googleapis.com-ruby-quickstart.yaml")
SCOPE = Google::Apis::SheetsV4::AUTH_SPREADSHEETS_READONLY

# ID of the data model sheet
SPREADSHEET_ID="1fL3naWSpL_iDxkCN51g1CSLhXU6uAd1vwxZ0m1I4Zeg"

##
# Ensure valid credentials, either by restoring from the saved credentials
# files or intitiating an OAuth2 authorization. If authorization is required,
# the user's default browser will be launched to approve the request.
#
# @return [Google::Auth::UserRefreshCredentials] OAuth2 credentials
def authorize
  FileUtils.mkdir_p(File.dirname(CREDENTIALS_PATH))

  client_id = Google::Auth::ClientId.from_file(CLIENT_SECRETS_PATH)
  token_store = Google::Auth::Stores::FileTokenStore.new(file: CREDENTIALS_PATH)
  authorizer = Google::Auth::UserAuthorizer.new(
    client_id, SCOPE, token_store)
  user_id = 'default'
  credentials = authorizer.get_credentials(user_id)
  if credentials.nil?
    url = authorizer.get_authorization_url(
      base_url: OOB_URI)
    puts "Open the following URL in the browser and enter the " +
         "resulting code after authorization"
    puts url
    code = gets
    credentials = authorizer.get_and_store_credentials_from_code(
      user_id: user_id, code: code, base_url: OOB_URI)
  end
  credentials
end

def get_spreadsheet
  # Initialize the API
  service = Google::Apis::SheetsV4::SheetsService.new
  service.client_options.application_name = APPLICATION_NAME
  service.authorization = authorize

  # Prints the names and majors of students in a sample spreadsheet:
  # https://docs.google.com/spreasdheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
  spreadsheet_id = SPREADSHEET_ID
  range = 'EvidenceStatement!A2:C'

  service.get_spreadsheet(spreadsheet_id)
end

# response = service.get_spreadsheet_values(spreadsheet_id, range)
# puts 'Name, Major:'
# puts 'No data found.' if response.values.empty?
# response.values.each do |row|
#   # Print columns A and E, which correspond to indices 0 and 4.
#   puts "#{row[0]}, #{row[1]}"
# end
