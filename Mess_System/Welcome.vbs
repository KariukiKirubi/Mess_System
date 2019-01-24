Dim msg, sapi
msg= "Welcome To Mess Management Software,"
msg2="The Database is requesting activation"
Set sapi=CreateObject("sapi.spvoice")

sapi.Speak msg
sapi.Speak msg2