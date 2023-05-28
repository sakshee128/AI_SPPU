import random
responses={
    "hi":["Hello","Hi there","Hey!"],
    "how are you":["I'm doing well, thanks for asking!","Pretty good","Not too bad."],
    "what's your name":["My name is chatbot","You can call me chatbot","I go by chatbot."],
    "bye":["GoodBye","See you later!","Bye!"]
}
def chatbot():
    print("Welcome to chatbot! ,How can I assist you ?")
    while True:
        user_input=input().lower()
        if user_input in responses:
            print(random.choice(responses[user_input]))
        else:
                print("I'm sorry, I didn't understand what you said.")
chatbot()

