Spring with GraphQL

to go to graphql url

http://localhost:8080/graphiql?path=/graphql

query{
    courseSubjects{
        id
        subjectName
        students{
            id
            firstName
        }
    }
}

*********

query{
    students{
        id
        firstName
        courseSubject{
            id
            subjectName
        }
    }
}

************
query{
    courseSubjectById(id: 4){
        id
        subjectName
        students{
            id
            firstName
        }
    }
}

***********

query{
    courseSubjectById(id: 4){
        id
        subjectName
        students{
            id
            firstName
        }
    }
    courseSubjects{
        id
        subjectName
        students{
            id
            firstName
        }
    }
}

*****************
mutation{
    addStudent(student:{firstName:"Raj",lastName: "Shankar",studentId:"106",age: 34,courseSubjectId: 4}){
        id
    }
}