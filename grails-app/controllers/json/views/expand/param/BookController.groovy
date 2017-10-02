package json.views.expand.param

class BookController {

    static responseFormats = ['json']

    def displayTestBook() {
        respond new Book(
                title: 'It',
                author: 'Stephen King',
                pages: 1001
        ), view: 'show'
    }
}
