from abc import ABC, abstractmethod


class index(ABC):

    def __init__(self, set_link):
        self.setURL = set_link

    @property
    @abstractmethod
    def URL(self):
        pass


class PushButton(index):

    def __init__(self, set_link, set_anotherLink):
        super().__init__(set_link)
        self.setLink = set_anotherLink

    @index.URL.getter
    def URL(self):
        return self.__setURL

    @URL.setter
    def setURL(self, set_link):
        self.__setURL = set_link

    @property
    def click(self):
        verify = input("Click Button ? (Y/N)")

        if verify.lower() == "y":
            print("Go to {} OR {}".format(self.setURL, self.setLink))
        elif verify.lower() == "n":
            pass
        else:
            pass


panggil = PushButton("https://www.youtube.com/", "https://www.instagram.com/")

panggil.click
